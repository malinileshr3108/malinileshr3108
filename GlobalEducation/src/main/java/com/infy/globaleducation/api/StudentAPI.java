package com.infy.globaleducation.api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.infy.globaleducation.dto.StudentDTO;
import com.infy.globaleducation.exception.GlobalEducationException;
import com.infy.globaleducation.service.StudentService;

public class StudentAPI {

	private StudentService studentService;
	
	public ResponseEntity<StudentDTO> registerStudent(StudentDTO studentDTO) throws GlobalEducationException
	{
		return null;
		
	}
	public ResponseEntity<List<StudentDTO>> getStudentByCountryAndIntake(String country, Integer intakeYear)throws GlobalEducationException
	{
		return null;
		
	}
}
