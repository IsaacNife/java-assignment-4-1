package com.codercampus.assignment1;

import java.io.Serializable;

public class Student {
	private static final long serialVersionUID = 1L;
	private String studentID;
	private String studentName;
	private String course;
	private String grade;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String StudentInfo (Student[] students) {
		
		String info =  getStudentID() + "," + getStudentName()+ "," + getCourse() + "," +  getGrade() + "\n";
		return info;
		 
	}
	

}
