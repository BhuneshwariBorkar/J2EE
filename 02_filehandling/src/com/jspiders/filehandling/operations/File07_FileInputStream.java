package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class File07_FileInputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\\\ADV_JAVA_Test\\\\J2EE\\\\02_filehandling\\\\db_info2.txt");
		
		if(file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			System.out.println(fileInputStream.read());
			fileInputStream.close();
			System.out.println("Data is fetched from the file");			
		} else {
			System.out.println("file does not exists ");
		}
	}
}
