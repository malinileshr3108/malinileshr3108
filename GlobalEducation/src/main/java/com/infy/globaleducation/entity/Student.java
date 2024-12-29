package com.infy.globaleducation.entity;

public class Student {

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
}
