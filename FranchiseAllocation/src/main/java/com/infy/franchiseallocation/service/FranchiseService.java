package com.infy.franchiseallocation.service;

import java.util.List;

import com.infy.franchiseallocation.dto.FranchiseDTO;
import com.infy.franchiseallocation.exception.FranchiseAllocationException;

public interface FranchiseService {
	List<FranchiseDTO> getFranchiseReport(String location) throws FranchiseAllocationException;
	FranchiseDTO allocateFranchise(FranchiseDTO franchiseDTO) throws FranchiseAllocationException;
	Double calculateTenure(Double quotedPrice);
}
