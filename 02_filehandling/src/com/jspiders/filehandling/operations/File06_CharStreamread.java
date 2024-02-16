package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File06_CharStreamread {
	 public static void main(String[] args) throws IOException {
		File file = new File("E:\\ADV_JAVA_Test\\J2EE\\02_filehandling\\db_info.txt");
		if(file.exists()) {
			FileReader fileReader = new FileReader(file);
			System.out.println(fileReader.read());
			fileReader.close(); // give the data in the from of byte stream
			
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.print(scanner.nextLine());
			}
			scanner.close();
		} else {
			System.out.println("file is not exits..");
		}
	}
}
