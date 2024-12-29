package com.infy.globaleducation.dto;

import com.infy.globaleducation.entity.Student;

public class StudentDTO {
	private Integer studentId;
	private String studentName;
	private String emailId;
	private String interestedCountry;
	private Integer intakeYear;
	private String studyLevel;
	private String courseInterested;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getInterestedCountry() {
		return interestedCountry;
	}
	public void setInterestedCountry(String interestedCountry) {
		this.interestedCountry = interestedCountry;
	}
	public Integer getIntakeYear() {
		return intakeYear;
	}
	public void setIntakeYear(Integer intakeYear) {
		this.intakeYear = intakeYear;
	}
	public String getStudyLevel() {
		return studyLevel;
	}
	public void setStudyLevel(String studyLevel) {
		this.studyLevel = studyLevel;
	}
	public String getCourseInterested() {
		return courseInterested;
	}
	public void setCourseInterested(String courseInterested) {
		this.courseInterested = courseInterested;
	}
	public static StudentDTO prepareDTO(Student student)
	{
		StudentDTO studentDTO= new StudentDTO();
		studentDTO.setStudentId(student.getStudentId());
		studentDTO.setStudentName(student.getStudentName());
		studentDTO.setEmailId(student.getEmailId());
		studentDTO.setInterestedCountry(student.getInterestedCountry());
		studentDTO.setIntakeYear(student.getIntakeYear());
		studentDTO.setStudyLevel(student.getStudyLevel());
		studentDTO.setCourseInterested(student.getCourseInterested());
		return studentDTO;
		
	}
	public static Student prepareEntity(StudentDTO studentDTO)
	{
		Student student= new Student();
		student.setStudentName(studentDTO.getStudentName());
		student.setEmailId(studentDTO.getEmailId());
		student.setInterestedCountry(studentDTO.getInterestedCountry());
		student.setIntakeYear(studentDTO.getIntakeYear());
		student.setStudyLevel(studentDTO.getStudyLevel());
		student.setCourseInterested(studentDTO.getCourseInterested());
		return student;
		
	}
}
