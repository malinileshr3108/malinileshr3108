package com.infy.hospitalmanagement.service;

import java.util.List;

import com.infy.hospitalmanagement.dto.PatientDTO;
import com.infy.hospitalmanagement.exception.PatientAdmissionException;
import com.infy.hospitalmanagement.repository.PatientRepository;

public class PatientServiceImpl  implements PatientService{
	private PatientRepository patientRepository;

	@Override
	public List<PatientDTO> getListOfPatients(String diagnosis) throws PatientAdmissionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientDTO admitPatient(PatientDTO patientDTO) throws PatientAdmissionException {
		// TODO Auto-generated method stub
		return null;
	}

}
