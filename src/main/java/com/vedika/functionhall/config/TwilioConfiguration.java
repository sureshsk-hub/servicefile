package com.vedika.functionhall.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("twilio")
public class TwilioConfiguration {

	private String account_sid;
	private String authToken;
	private String trialNumber;

	public TwilioConfiguration() {

	}

	
	public String getAccount_sid() {
		return account_sid;
	}


	public void setAccount_sid(String account_sid) {
		this.account_sid = account_sid;
	}


	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getTrialNumber() {
		return trialNumber;
	}

	public void setTrialNumber(String trialNumber) {
		this.trialNumber = trialNumber;
	}
}
