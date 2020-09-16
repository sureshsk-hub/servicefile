package com.vedika.functionhall.model;

public class Location {
	private String country;
	private String state;
	private String streetAddress;
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	private String city;
	private String zipcode;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Location [country=" + country + ", state=" + state + ", streetAddress=" + streetAddress + ", city="
				+ city + ", zipcode=" + zipcode + "]";
	}
	
	


}
