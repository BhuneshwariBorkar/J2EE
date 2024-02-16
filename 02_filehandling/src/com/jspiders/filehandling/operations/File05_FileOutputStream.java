package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File05_FileOutputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\ADV_JAVA_Test\\J2EE\\02_filehandling\\db_info2.txt");
		if(file.exists()) {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(1244);
			System.out.println("DATA written inside the file");
			fileOutputStream.close();
		} else {
			System.out.println("File not exist..\nWe need to create the file");
			boolean status = file.createNewFile();
			if(status) {
				System.out.println("File is created..");
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				fileOutputStream.write(1223);
				System.out.println("DATA written inside the file");
				fileOutputStream.close();
			} else {
				System.out.println("file in not created ");
			}
		}
	}
}


