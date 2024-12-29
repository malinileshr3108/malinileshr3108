package com.infy.hospitalmanagement.validator;

import java.time.LocalDate;

import com.infy.hospitalmanagement.dto.PatientDTO;
import com.infy.hospitalmanagement.exception.PatientAdmissionException;

public class PatientValidator {

	public PatientValidator() {
		super();
		// TODO Auto-generated constructor stub
	}
   public static void validatePatient(PatientDTO patientDTO) throws PatientAdmissionException
   {
	   
   }
   public static Boolean isValidDateOfBirth(LocalDate dateOfBirth) throws PatientAdmissionException
   {
	return null;   
   }
}
