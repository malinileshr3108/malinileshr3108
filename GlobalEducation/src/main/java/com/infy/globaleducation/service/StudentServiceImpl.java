package com.infy.globaleducation.service;

import java.util.List;

import com.infy.globaleducation.dto.StudentDTO;
import com.infy.globaleducation.exception.GlobalEducationException;
import com.infy.globaleducation.repository.StudentRepository;

public class StudentServiceImpl implements StudentService{

    private	StudentRepository studentRepository;
	@Override
	public StudentDTO registerStudent(StudentDTO studentDTO)throws GlobalEducationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDTO> getStudentByCountryAndIntake(String country, Integer intakeYear)throws GlobalEducationException {
		// TODO Auto-generated method stub
		return null;
	}

}
