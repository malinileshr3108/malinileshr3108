package com.infy.hospitalmanagement.api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.infy.hospitalmanagement.dto.PatientDTO;
import com.infy.hospitalmanagement.exception.PatientAdmissionException;
import com.infy.hospitalmanagement.service.PatientService;

public class PatientAPI {
 
	private PatientService patientService;
	
	public ResponseEntity<List<PatientDTO>>getPatientsByDiagnosis(String diagnosis) throws PatientAdmissionException{
		return null;
		
	}
	public ResponseEntity<PatientDTO>admitPatient(PatientDTO patientDTO) throws PatientAdmissionException
	{
		return null;
		
	}

}
