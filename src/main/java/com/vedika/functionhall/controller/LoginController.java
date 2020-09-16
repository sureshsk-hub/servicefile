package com.vedika.functionhall.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.vedika.functionhall.config.TwilioConfiguration;
import com.vedika.functionhall.exceptionapi.OwnerControllerException;
import com.vedika.functionhall.model.JwtResponse;
import com.vedika.functionhall.model.User;
import com.vedika.functionhall.model.UserLogin;
import com.vedika.functionhall.tokenservice.JwtTokenUtil;

@RestController
@RequestMapping("/api")
public class LoginController {
	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private MongoTemplate mongoTemplate;
	private TwilioConfiguration twilioConfiguration;

	private final static String ACCOUNT_SID = "AC03f7dc93379ddde947b1fd4cc5eb8f36";
	private final static String AUTH_ID = "325c07cf2524cf2815f0774f90939b98";
	static {
		Twilio.init(ACCOUNT_SID, AUTH_ID);
	}
	HashMap<String, UserLogin> otpdata = new HashMap<>();

	@RequestMapping(value = "/login/verification", method = RequestMethod.POST)
	public String sendOTP(@RequestParam String mobileNumber) throws OwnerControllerException {

		String message = "your not  registered with us please register";
		String message1 = "OTP SENT Successfully";
		String userdata1 = null;
		if (mobileNumber.isEmpty()) {
			throw new OwnerControllerException("please enter the MobileNumber");
		}
		try {

			Query query = new Query();
			query.addCriteria(Criteria.where("mobileNumber").is(mobileNumber));
			User userdata = mongoTemplate.findOne(query, User.class);

			if (userdata.getMobileNumber().equals(mobileNumber)) {

				UserLogin userlogin = new UserLogin();
				userlogin.setMobileNumber(mobileNumber);
				userlogin.setOtp(String.valueOf(new Random().nextInt(9999) + 1000));
				userlogin.setExpiretime(System.currentTimeMillis() + 200000);
				userlogin.setFirstName(userdata.getFirstName());

				otpdata.put(mobileNumber, userlogin);
				Message.creator(new PhoneNumber(mobileNumber), new PhoneNumber("+18647148412"),
						"Your vedika Login Authentication code is: " + userlogin.getOtp()).create();

				return message1;
			}
		} catch (Exception e) {
			throw new OwnerControllerException("your not  registered with us please register");
		}

		return message;

	}

	@RequestMapping(value = "login/verification", method = RequestMethod.PUT)
	public ResponseEntity<Object> verifyotp(@RequestBody UserLogin user, @RequestParam String mobileNumber) throws OwnerControllerException {

		if (user.getOtp() == null || user.getOtp().trim().length() <= 0) {

			throw new OwnerControllerException("please provide otp");
		}

		UserLogin userdata = otpdata.get(mobileNumber);
		if (userdata != null) {
			if (userdata.getExpiretime() >= System.currentTimeMillis()) {

				if (userdata.getOtp().equals(user.getOtp())) {
					String msg = "OTP Verified successfully";
					otpdata.remove(mobileNumber);
					final String token = jwtTokenUtil.generateToken(mobileNumber);
					final Date expirationtime = jwtTokenUtil.getExpirationDateFromToken(token);
					DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
					String strDate = dateFormat.format(expirationtime);
					String firstName = userdata.getFirstName();
					JwtResponse res = new JwtResponse(token, strDate, firstName, msg);
					res.setFirstname(userdata.getFirstName());
					res.getExpirationtime();
					res.setMsg(msg);
					return ResponseEntity.ok(new JwtResponse(token, strDate, firstName, msg));

				}

				return new ResponseEntity<>("Invalid OTP", HttpStatus.BAD_REQUEST);

			}
			return new ResponseEntity<>("OTP has Expired", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("Something went wrong", HttpStatus.BAD_REQUEST);

	}

}
