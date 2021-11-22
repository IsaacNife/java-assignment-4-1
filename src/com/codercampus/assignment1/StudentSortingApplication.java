package com.codercampus.assignment1;

import java.io.IOException;

public class StudentSortingApplication {
	 public static void main(String[] args)throws ClassNotFoundException, IOException{
  	   CreateFiles createFiles = new CreateFiles();
  	   ReadingFile readFile = new ReadingFile();
  	   String[]value = readFile.values();
  	   FileWriting fileWriter = new FileWriting();
  	   Student[]everyStudents = readFile.everyStudents(value);
  	   fileWriter.compSciStudents(everyStudents);
  	   
  	   Student [] compSci = fileWriter.compSciStudents(everyStudents);
			Student [] APMTHStudent = fileWriter.APMTHStudent(everyStudents);
			Student [] STATStudent = fileWriter.STATStudent(everyStudents);
			
			compSci = createFiles.organized(compSci);
			APMTHStudent = createFiles.organized(APMTHStudent);
			STATStudent = createFiles.organized(STATStudent);
			
			fileWriter.writeFiles(compSci);
			fileWriter.writeFiles2(APMTHStudent);
			fileWriter.writeFiles3(STATStudent);
     }

}
