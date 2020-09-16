package com.vedika.functionhall.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vedika.functionhall.exceptionapi.OwnerControllerException;
import com.vedika.functionhall.model.FunctionHall;
import com.vedika.functionhall.model.FunctionHallUIResponse;
import com.vedika.functionhall.model.GenericResponse;
import com.vedika.functionhall.model.Owner;
import com.vedika.functionhall.service.OwnerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class OwnerController {
	Logger logger = LoggerFactory.getLogger(OwnerController.class);

	@Autowired
	private OwnerService ownerService;
	
	final static public String  gst="18%";

	@RequestMapping(value = "/functionhalls", method = RequestMethod.GET)
	public ResponseEntity<GenericResponse<List<Object>>> findFunctionhallByNameAndCity(
			@RequestParam(value = "city", required = false) String city,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "timeslot", required = false) String timeslot,
			@RequestParam(value = "Date", required = false) String date) throws OwnerControllerException { 
             // ToDo: add a log statement
            //ToDo: add a request timeSlot
		logger.info("find by name:" + name);
		logger.info("find by city:" + city);
		// logger.info("findby maximumguest:" + maximumguest);
		
		List<FunctionHallUIResponse> functionhallsUI = new ArrayList<FunctionHallUIResponse>();

		

		List<Owner> functionhallOwners = ownerService.findFunctionHallByNameAndCity(city, name);
		
		if(functionhallOwners.isEmpty()) {
			throw new OwnerControllerException("functionhalls not found : " + city);
		}
	
		if (null != functionhallOwners && !functionhallOwners.isEmpty()) {
			for (Owner owner : functionhallOwners) {

				List<FunctionHall> funtionhalls = owner.getFunctionhall();

				if (null != funtionhalls && !funtionhalls.isEmpty()) {

					for (FunctionHall functionhall : funtionhalls) {
                        
						FunctionHallUIResponse response = new FunctionHallUIResponse();
					
					   	response.setGstpercentage(gst);
					   	response.setGrandTotal((18*functionhall.getFunctionhallPrice()/100)+functionhall.getFunctionhallPrice());
						response.setFunctionhallPrice(functionhall.getFunctionhallPrice());
						response.setZipCode(functionhall.getZipCode());
						response.setFunctionhallId(functionhall.getFunctionhallId());
						response.setName(functionhall.getName());
						response.setOwnerFirstName(owner.getFirstName());
						response.setOwnerLastName(owner.getLastName());
						response.setOwnerId(owner.getOwnerId());
						response.setCity(functionhall.getCity());
						response.setStreet(functionhall.getStreetAddress());
						response.setFunctionhalldescription(functionhall.getFunctionhalldescription());
						response.setFunctionhalltype(functionhall.getFunctionhalltype());
						response.setMaximumguest(functionhall.getMaximumguest());
						response.setState(functionhall.getState());
						response.setImageUrl(functionhall.getImageUrl());
						response.setCorrelationid(functionhall.getCorrelationId());
						response.setFunctionhallContactNumber(functionhall.getFunctionhallContactNumber());
						response.setAirconditioning(functionhall.getAirconditioning());
						response.setBanquethall(functionhall.getBanquethall());
						response.setDancefloor(functionhall.getDancefloor());
						response.setEventspace(functionhall.getEventspace());
						response.setInternet(functionhall.getInternet());
						response.setLightingsystem(functionhall.getLightingsystem());
						response.setNightclub(functionhall.getNightclub());
						response.setNoalcohol(functionhall.getNoalcohol());
						response.setNosmoking(functionhall.getNosmoking());
						response.setPartyroom(functionhall.getPartyroom());
						response.setParking(functionhall.getParking());
						response.setSoundsystem(functionhall.getSoundsystem());
						response.setWeddinghall(functionhall.getWeddinghall());
						response.setConference(functionhall.getConference());
						response.setPerformance(functionhall.getPerformance());

						functionhallsUI.add(response);
					}
				}
			}
		}
		
	
		GenericResponse<List<FunctionHallUIResponse>> response = new GenericResponse<List<FunctionHallUIResponse>>();
		response.setData(functionhallsUI);
		return null;
		
	}
	

	@RequestMapping(value="/deletefunctionhall",method=RequestMethod.DELETE)
	public String deletefunctionhall(@RequestParam(value = "name", required = false) String name){
		
		ownerService.deletefunctionhall("name");
		
		return name;
		
	}
	
	@RequestMapping(value = "/owner", method = RequestMethod.GET)
	public ResponseEntity<GenericResponse<List<FunctionHallUIResponse>>> findFunctionhallByNameAndCity(
			@RequestParam(value = "ownerId", required = false) String _id) {

		List<Owner> functionhallOwners = ownerService.findByownerID(_id);

		List<FunctionHallUIResponse> functionhallsUI = new ArrayList<FunctionHallUIResponse>();

		if (null != functionhallOwners && !functionhallOwners.isEmpty()) {
			for (Owner owner : functionhallOwners) {

				List<FunctionHall> funtionhalls = owner.getFunctionhall();

				if (null != funtionhalls && !funtionhalls.isEmpty()) {

					for (FunctionHall functionhall : funtionhalls) {

						FunctionHallUIResponse response = new FunctionHallUIResponse();
						response.setName(functionhall.getName());
						response.setOwnerFirstName(owner.getFirstName());
						response.setOwnerLastName(owner.getLastName());
						response.setOwnerId(owner.getOwnerId());
						response.setCity(functionhall.getCity());
						response.setFunctionhalldescription(functionhall.getFunctionhalldescription());
						response.setFunctionhalltype(functionhall.getFunctionhalltype());
						response.setMaximumguest(functionhall.getMaximumguest());
						response.setState(functionhall.getState());
						response.setImageUrl(functionhall.getImageUrl());
						response.setCorrelationid(functionhall.getCorrelationId());
						response.setFunctionhallContactNumber(functionhall.getFunctionhallContactNumber());
						response.setFunctionhallContactNumber(owner.getOwnerContactNumber());
						functionhallsUI.add(response);
					}
				}
			}

		}

		GenericResponse<List<FunctionHallUIResponse>> response = new GenericResponse<List<FunctionHallUIResponse>>();
		response.setData(functionhallsUI);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
