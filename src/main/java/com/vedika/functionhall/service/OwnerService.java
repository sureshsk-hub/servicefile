package com.vedika.functionhall.service;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.vedika.functionhall.model.Owner;

@Service
public interface OwnerService {

	Owner saveOrUpdateOwner(Owner owner);

	List<Owner> findFunctionHallByNameAndCity(String city, String name);

	void update(String correlationid, String imageUrl) throws FileNotFoundException, RuntimeException;


	List<Owner> findByownerID(String _id);




	String deletefunctionhall(String functionhallId);


}