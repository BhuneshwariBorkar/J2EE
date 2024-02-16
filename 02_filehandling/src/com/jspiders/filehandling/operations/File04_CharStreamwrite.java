package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File04_CharStreamwrite {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\ADV_JAVA_Test\\J2EE\\02_filehandling\\db_info.txt");
		
		if(file.exists()) {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Java is programmming language..");
			System.out.println("Data is Written to the file");
			fileWriter.close();
			
		} else {
			System.out.println("File is not exist..");
			boolean status = file.createNewFile();
			if(status) {
				System.out.println("file created..");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("Java");
				System.out.println("Data is Written inside the file");
				fileWriter.close();
			} else {
				System.out.println("File is not created..");
			}
		}
	}
}
