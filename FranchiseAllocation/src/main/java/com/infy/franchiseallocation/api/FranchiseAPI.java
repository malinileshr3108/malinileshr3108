package com.infy.franchiseallocation.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.franchiseallocation.dto.FranchiseDTO;
import com.infy.franchiseallocation.exception.FranchiseAllocationException;
import com.infy.franchiseallocation.service.FranchiseService;
@RestController
@RequestMapping(value = "api")
@Validated
public class FranchiseAPI {
	@Autowired
	private FranchiseService franchiseService;
	@GetMapping(value = "")
	public ResponseEntity<List<FranchiseDTO>>getFranchiseReport(@PathVariable @Valid String location) throws FranchiseAllocationException{
		List<FranchiseDTO> franchiseDTOs=franchiseService.getFranchiseReport(location);
		return new ResponseEntity<>(franchiseDTOs,HttpStatus.OK);	
	}
	@PostMapping(value = "", consumes = "application/json")
	public ResponseEntity<FranchiseDTO> allocateFranchise(@RequestBody @Valid FranchiseDTO franchiseDTO) throws FranchiseAllocationException{
		FranchiseDTO franchiseDTO2=franchiseService.allocateFranchise(franchiseDTO);
		return new ResponseEntity<>(franchiseDTO2,HttpStatus.CREATED);
		
	}

}
