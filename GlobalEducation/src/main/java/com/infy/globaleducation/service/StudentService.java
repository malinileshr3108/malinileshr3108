package com.infy.globaleducation.service;

import java.util.List;

import com.infy.globaleducation.dto.StudentDTO;
import com.infy.globaleducation.exception.GlobalEducationException;

public interface StudentService {

	 StudentDTO registerStudent(StudentDTO studentDTO) throws GlobalEducationException;
	 List<StudentDTO> getStudentByCountryAndIntake(String country,Integer intakeYear)throws GlobalEducationException;
}
