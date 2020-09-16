package com.vedika.functionhall.service;

import org.springframework.stereotype.Service;

import com.vedika.functionhall.exceptionapi.OwnerControllerException;
import com.vedika.functionhall.model.Owner;
import com.vedika.functionhall.model.PublishDetails;

@Service
public interface PublishService {
	Owner saveOrUpdatepublishListing(PublishDetails publishDetails, Owner owner) throws OwnerControllerException;

}
