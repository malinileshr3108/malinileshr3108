package com.infy.franchiseallocation.validator;



import java.time.LocalDate;



import com.infy.franchiseallocation.dto.FranchiseDTO;
import com.infy.franchiseallocation.exception.FranchiseAllocationException;

public class FranchiseValidator {
	
	public FranchiseValidator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void validateFranchise(FranchiseDTO franchiseDTO) throws FranchiseAllocationException
	{
		if (franchiseDTO.getQuotedPrice()<1000000) {
			throw new FranchiseAllocationException("FranchiseValidator.INVALID_QUOTEDPRICE");
		}
		if (franchiseDTO.getStartUpdate().equals(franchiseDTO.getRegistrationDate())==false|franchiseDTO.getStartUpdate().isEqual(franchiseDTO.getRegistrationDate().plusMonths(6))==false) {
			throw new FranchiseAllocationException("FranchiseValidator.INVALID_DATE");
		}
		//@Pattern(regexp = "([0-9]{2}(-)[A-Z]{8}(-)[0-9]+(-)[I](-)[1|5](-))",message = "{FranchiseValidator.INVALID_TAXNO}")
		if (franchiseDTO.getTaxNumber().contains("([0-9]{2}(-)[A-Z]{8}(-)[0-9]+(-)[I](-)[1|5](-))")==false) {
			throw new FranchiseAllocationException("FranchiseValidator.INVALID_TAXNO");
		}
	}
	
	public static Boolean isValidQuotedPrice(Double quotedPrice)
	{
		if (quotedPrice<1000000.0) {
			return false;
		}
		return true;
		
		
	}
	public static Boolean isValidDates(LocalDate registrationDate, LocalDate startUpDate)
	{
		if (startUpDate.isBefore(registrationDate) || startUpDate.isAfter(registrationDate.plusMonths(6))) {
			return false;
		}else {
			return true;
	}
	}
	public static Boolean isValidTaxNo(String taxNumber)
	{
//		String regex="([0-9]{2}(-)[A-Z]{8}(-)[0-9]+(-)[I](-)[1|5](-))";
//		if (taxNumber.matches(regex)) {
//			return true;
//		}else {
//			return false;
//		}
		
		if (taxNumber.contains("([0-9]{2}(-)[A-Z]{8}(-)[0-9]+(-)[I](-)[1|5](-))")) {
			return true;
		}
		return false;
		
	}

}