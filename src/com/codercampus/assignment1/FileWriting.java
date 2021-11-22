package com.codercampus.assignment1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	
	private static final long serialVersionUID = 1L;
	
	                public Student[] compSciStudents(Student[] students) {
	                	Student[] compSciStudent = new Student[100];
	                	
	                	for(int i = 0; i < 100; i++) {
	                		boolean matchFound = students[i].getCourse().matches("[C-S ]+[0-9]+");
	                		if(matchFound && students[i]!= null) {
	                			compSciStudent[i] = students[i];
	                		}
	                	}return compSciStudent;
	                	
	                }
	                public Student[] APMTHStudent(Student[] students) {
	                	Student[] AMPTHStudent = new Student[100];
	                	for(int i = 0; i < 100; i++) {
	                		boolean matchFound = students[i].getCourse().matches("[A-T ]{5} [0-9]+");
	        				if(matchFound && students[i]!=null){
	        					AMPTHStudent[i] =students[i];
	                	}
	                }
	                	return AMPTHStudent;
	                	
	                }
	                
	                public Student[] STATStudent(Student[] students) {
	                	Student[] STATStudent = new Student[100];
	        			for(int i = 0; i < 100 ; i++) {
	        				boolean matchFound = students[i].getCourse().matches("[A-T ]{4} [0-9]+");
	        				if(matchFound){
	        					STATStudent[i] = students[i];
	        				}
	                	
	                }
	        			return STATStudent;
	                }
	                public void writeFiles(Student[]arrays) throws IOException {
	                	BufferedWriter writer = null;
	                	
	                	try {
	                		writer = new BufferedWriter(new FileWriter("course1.csv"));
	                		writer.write("StudentID, Name, Course, Grade, \n");
	                		for(int i = 0; i < arrays.length; i++) {
	                			if(arrays[i]!=null) {
	                				writer.write(arrays[i].StudentInfo(arrays));
	                			}
	                		}
	                	} finally {
	                		if(writer!=null) {
	                			writer.close();
	                		}
	                	}
	                }
	                public void writeFiles2(Student[]arrays)throws IOException {
	        			BufferedWriter writer = null;
	        			
	        			try {
	        				writer = new BufferedWriter(new FileWriter("course2.csv"));
	        				writer.write("StudentID, Name, Course, Grade, \n");
	        				for(int i = 0; i<arrays.length; i++) {
	        					if(arrays[i]!=null) {
	        					writer.write(arrays[i].StudentInfo(arrays));
	        					}
	        				}
	        					
	        			}finally {
	        				if(writer!=null) {
	        					writer.close();
	        				}
	        			}
	        		
	        		}
	                public void writeFiles3(Student[]arrays)throws IOException {
	        			BufferedWriter writer = null;
	        			
	        			try {
	        				writer = new BufferedWriter(new FileWriter("course3.csv"));
	        				writer.write("StudentID, Name, Course, Grade, \n");
	        				for(int i = 0; i<arrays.length; i++) {
	        					if(arrays[i]!=null) {
	        					writer.write(arrays[i].StudentInfo(arrays));
	        					}
	        				}
	        					
	        			}finally {
	        				if(writer!=null) {
	        					writer.close();
	        				}
	        			}
	        		
	        		}		

}   


