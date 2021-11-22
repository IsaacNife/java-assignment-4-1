package com.codercampus.assignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
	public String[] values() {
		String fileName = "student-master-list.csv";
		String[] values = new String[101];
		BufferedReader fileReader = null;
		{
			
			try {
				fileReader = new BufferedReader(new FileReader(fileName));
				
				for(int i = 0; i < 100; i++) {
					values[i] = fileReader.readLine();
				
				}
			}catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
			try {
				
			}finally {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		} return values;
		
	}
	
	public Student[] everyStudents (String [] values) {
		Student[] everyStudents = new Student[100];
		String[] studentInfo = new String[100];
		for (int i = 0; i < 100; i++) {
			studentInfo = values[i].split(",");
			everyStudents[i] = UserService.createStudent(studentInfo);
		}
		return everyStudents;
	}

}
