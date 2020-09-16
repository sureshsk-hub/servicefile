package com.vedika.functionhall.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import org.springframework.data.annotation.Id;

public class FunctionHall {
	@Id
	private String id;
	private String name;
	private String ownerId;
	private String ownerFirstName;
	private String ownerLastName;
	private String functionhalldescription;
	private int maximumguest;
	private int functionhallId;
	private String functionhallContactNumber;
	private String functionhalltype;
	private int functionhallPrice;
	private int grantTotal;
	private int briderooms;
	

	public int getBriderooms() {
		return briderooms;
	}
	public void setBriderooms(int briderooms) {
		this.briderooms = briderooms;
	}
	private String streetAddress;
	private String state;
	private String country;
	private String city;
	private String zipCode;
	private Boolean parking;
	private Boolean internet;
	private Boolean nosmoking;
	private Boolean airconditioning;
	private Boolean soundsystem;
	private Boolean lightingsystem;
	private Boolean dancefloor;
	private Boolean noalcohol;
	private Boolean banquethall;
	private Boolean partyroom;
	private Boolean conference;
	private Boolean performance;
	private Boolean weddinghall;
	private Boolean nightclub;
	private Boolean eventspace;
	private String email;
	private String[] imageUrl;
	private LocalDate date;
	private LocalTime timeSlot;
	private String correlationId;
	public int getGrantTotal() {
		return grantTotal;
	}
	public void setGrantTotal(int grantTotal) {
		this.grantTotal = grantTotal;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerFirstName() {
		return ownerFirstName;
	}
	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}
	public String getOwnerLastName() {
		return ownerLastName;
	}
	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}

	public String getFunctionhalldescription() {
		return functionhalldescription;
	}
	public void setFunctionhalldescription(String functionhalldescription) {
		this.functionhalldescription = functionhalldescription;
	}
	public int getMaximumguest() {
		return maximumguest;
	}
	public void setMaximumguest(int maximumguest) {
		this.maximumguest = maximumguest;
	}
	
	public int getFunctionhallId() {
		return functionhallId;
	}
	public void setFunctionhallId(int functionhallId) {
		this.functionhallId = functionhallId;
	}
	public String getFunctionhallContactNumber() {
		return functionhallContactNumber;
	}
	public void setFunctionhallContactNumber(String functionhallContactNumber) {
		this.functionhallContactNumber = functionhallContactNumber;
	}

	
	public String getFunctionhalltype() {
		return functionhalltype;
	}
	public void setFunctionhalltype(String functionhalltype) {
		this.functionhalltype = functionhalltype;
	}
	public int getFunctionhallPrice() {
		return functionhallPrice;
	}
	public void setFunctionhallPrice(int functionhallPrice) {
		this.functionhallPrice = functionhallPrice;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Boolean getParking() {
		return parking;
	}
	public void setParking(Boolean parking) {
		this.parking = parking;
	}
	public Boolean getInternet() {
		return internet;
	}
	public void setInternet(Boolean internet) {
		this.internet = internet;
	}
	public Boolean getNosmoking() {
		return nosmoking;
	}
	public void setNosmoking(Boolean nosmoking) {
		this.nosmoking = nosmoking;
	}
	public Boolean getAirconditioning() {
		return airconditioning;
	}
	public void setAirconditioning(Boolean airconditioning) {
		this.airconditioning = airconditioning;
	}
	public Boolean getSoundsystem() {
		return soundsystem;
	}
	public void setSoundsystem(Boolean soundsystem) {
		this.soundsystem = soundsystem;
	}
	public Boolean getLightingsystem() {
		return lightingsystem;
	}
	public void setLightingsystem(Boolean lightingsystem) {
		this.lightingsystem = lightingsystem;
	}
	public Boolean getDancefloor() {
		return dancefloor;
	}
	public void setDancefloor(Boolean dancefloor) {
		this.dancefloor = dancefloor;
	}
	public Boolean getNoalcohol() {
		return noalcohol;
	}
	public void setNoalcohol(Boolean noalcohol) {
		this.noalcohol = noalcohol;
	}
	public Boolean getBanquethall() {
		return banquethall;
	}
	public void setBanquethall(Boolean banquethall) {
		this.banquethall = banquethall;
	}
	public Boolean getPartyroom() {
		return partyroom;
	}
	public void setPartyroom(Boolean partyroom) {
		this.partyroom = partyroom;
	}
	public Boolean getConference() {
		return conference;
	}
	public void setConference(Boolean conference) {
		this.conference = conference;
	}
	public Boolean getPerformance() {
		return performance;
	}
	public void setPerformance(Boolean performance) {
		this.performance = performance;
	}
	public Boolean getWeddinghall() {
		return weddinghall;
	}
	public void setWeddinghall(Boolean weddinghall) {
		this.weddinghall = weddinghall;
	}
	public Boolean getNightclub() {
		return nightclub;
	}
	public void setNightclub(Boolean nightclub) {
		this.nightclub = nightclub;
	}
	public Boolean getEventspace() {
		return eventspace;
	}
	public void setEventspace(Boolean eventspace) {
		this.eventspace = eventspace;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String[] imageUrl) {
		this.imageUrl = imageUrl;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(LocalTime timeSlot) {
		this.timeSlot = timeSlot;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	@Override
	public String toString() {
		return "FunctionHall [id=" + id + ", name=" + name + ", ownerId=" + ownerId + ", ownerFirstName="
				+ ownerFirstName + ", ownerLastName=" + ownerLastName + ", functionhalldescription="
				+ functionhalldescription + ", maximumguest=" + maximumguest + ", functionhallId=" + functionhallId
				+ ", functionhallContactNumber=" + functionhallContactNumber + ", functionhalltype=" + functionhalltype
				+ ", functionhallPrice=" + functionhallPrice + ", grantTotal=" + grantTotal + ", streetAddress="
				+ streetAddress + ", state=" + state + ", country=" + country + ", city=" + city + ", zipCode="
				+ zipCode + ", parking=" + parking + ", internet=" + internet + ", nosmoking=" + nosmoking
				+ ", airconditioning=" + airconditioning + ", soundsystem=" + soundsystem + ", lightingsystem="
				+ lightingsystem + ", dancefloor=" + dancefloor + ", noalcohol=" + noalcohol + ", banquethall="
				+ banquethall + ", partyroom=" + partyroom + ", conference=" + conference + ", performance="
				+ performance + ", weddinghall=" + weddinghall + ", nightclub=" + nightclub + ", eventspace="
				+ eventspace + ", email=" + email + ", imageUrl=" + Arrays.toString(imageUrl) + ", date=" + date
				+ ", timeSlot=" + timeSlot + ", correlationId=" + correlationId + "]";
	}

}
	