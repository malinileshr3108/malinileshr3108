package com.infy.franchiseallocation.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.franchiseallocation.dto.FranchiseDTO;
import com.infy.franchiseallocation.entity.Franchise;
import com.infy.franchiseallocation.exception.FranchiseAllocationException;
import com.infy.franchiseallocation.repository.FranchiseRepository;
@Service("franchiseService")
@Transactional
public class FranchiseServiceImpl implements FranchiseService {

	@Autowired
	private FranchiseRepository franchiseRepository;
	@Override
	public List<FranchiseDTO> getFranchiseReport(String location) throws FranchiseAllocationException {
		// TODO Auto-generated method stub
		List<Franchise> franchises=franchiseRepository.getFranchiseByLocation(location);
		if (franchises.isEmpty()) {
			throw new FranchiseAllocationException("FranchiseService.FRANCHISE_UNAVAILABLE");
		}
		List<FranchiseDTO> franchiseDTOs= new ArrayList<>();
	
		return null;
	}

	@Override
	public FranchiseDTO allocateFranchise(FranchiseDTO franchiseDTO) throws FranchiseAllocationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculateTenure(Double quotedPrice) {
		// TODO Auto-generated method stub
		return null;
	}

}
