// file create using createNewFile() --- which return boolean value
package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.IOException;

public class File01_CreateNewFile {
	public static void main(String[] args) {
		File file = new File("E:\\ADV_JAVA_Test\\J2EE\\02_filehandling\\db_info.txt");
		
		try {
			boolean status = file.createNewFile();
			System.out.println(status);
			if(status) {
				System.out.println("File is Created..");
			} else {
				System.out.println("File is already exist");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
