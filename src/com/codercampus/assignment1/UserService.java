package com.codercampus.assignment1;

public class UserService {
	public static Student createStudent(String [] array) {
        Student student = new Student();
        student.setStudentID(array[0]);
        student.setStudentName(array[1]);
        student.setCourse(array[2]);
        student.setGrade(array[3]);
        return student;
}


}
