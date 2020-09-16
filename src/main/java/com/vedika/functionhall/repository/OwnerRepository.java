package com.vedika.functionhall.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.vedika.functionhall.model.Owner;

@Repository
public interface OwnerRepository extends MongoRepository<Owner, String> {
	@SuppressWarnings("unchecked")
	Owner save(Owner owner);

	@Query("{'$or':[{ 'functionhall.name' : ?0 },{'functionhall.city':?0}]}")

	List<Owner> findFunctionHallByNameAndCity(String city, String name);

	@Query(value = "{'functionhall.mobileNumber' : ?0")
	List<Owner> sendOTP(String mobileNumber);
 
	
	Owner save(String mobileNumber);

	@Query(value = "{'_id':?0}")
	List<Owner> findByownerID(String _id);
	
	void deleteById(String name);

}
