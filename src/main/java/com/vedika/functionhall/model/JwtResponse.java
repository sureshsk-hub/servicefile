package com.vedika.functionhall.model;

import java.io.Serializable;
import java.util.Date;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;

	private String msg;
	private String firstname;
	private final String jwttoken;
	private final String expirationtime;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public JwtResponse(String jwttoken, String strDate, String firstName, String msg) {

		this.expirationtime = strDate;
		this.jwttoken = jwttoken;
		this.firstname = firstName;
		this.msg = msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getJwttoken() {
		return jwttoken;
	}

	public String getExpirationtime() {
		return expirationtime;
	}

}
