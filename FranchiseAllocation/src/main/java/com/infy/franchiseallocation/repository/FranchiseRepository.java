package com.infy.franchiseallocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.infy.franchiseallocation.entity.Franchise;

public interface FranchiseRepository extends CrudRepository<Franchise, Integer>{
 
	@Query
	List<Franchise> getFranchiseByLocation(String location);
	List<Franchise> getFranchiseByFranchiseNameAndLocation(String franchisename, String location);
	List<Franchise> findByFranchiseNameAndLocatio(String franchiseName, String location);
 
}
