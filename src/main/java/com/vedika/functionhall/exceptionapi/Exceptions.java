package com.vedika.functionhall.exceptionapi;


public class Exceptions {
	
private int errorcode;
private String errormessage;

public Exceptions(String message) {
	// TODO Auto-generated constructor stub
}
public int getErrorcode() {
	return errorcode;
}
public Exceptions(int errorcode, String errormessage) {
	super();
	this.errorcode = errorcode;
	this.errormessage = errormessage;
}
public void setErrorcode(int errorcode) {
	this.errorcode = errorcode;
}
public String getErrormessage() {
	return errormessage;
}
@Override
public String toString() {
	return "Exceptions [errorcode=" + errorcode + ", errormessage=" + errormessage + "]";
}
public void setErrormessage(String errormessage) {
	this.errormessage = errormessage;
}
}