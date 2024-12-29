package com.infy.moviebooking.validator;

import com.infy.moviebooking.dto.MovieBookingDTO;
import com.infy.moviebooking.exception.MovieBookingException;

public class MovieBookingValidator {

	private MovieBookingValidator()
	{
		
	}
	public static void validate(MovieBookingDTO movieBookingDTO) throws MovieBookingException
	{
		if (isValidCustomerPhoneNo(movieBookingDTO.getCustomerPhoneNo())==false) {
			throw new MovieBookingException("Validator.INVALID_CUSTOMER_PHONE_NO");
		}
		if (isValidPaymentType(movieBookingDTO.getPaymentType())==false) {
			throw new MovieBookingException("Validator.INVALID_PAYMENT_TYPE");
		}
	}
	public static Boolean isValidPaymentType(String paymentType) throws MovieBookingException
	{
		String regexString="(Card|Wallet|NetBanking)";
		if (paymentType.matches(regexString)) {
			return true;
		}else
		return false;
		
	}
	public static Boolean isValidCustomerPhoneNo(Long customerPhoneNo) throws MovieBookingException
	{
		String regeString = "([3-9][\\d]{9})";
		if (customerPhoneNo.toString().matches(regeString)) {
			return true;
		}else {
			return false;
		}
		
	}
}
