package com.jspiders.filehandling.operations;

import java.io.File;

public class File03_FetchInfo {
	public static void main(String[] args) {
		File file = new File("E:\\ADV_JAVA_Test\\J2EE\\02_filehandling\\db_info.txt");
		
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getParent());
			System.out.println(file.isAbsolute());
			System.out.println(file.isDirectory());
			System.out.println(file.length());
			
			if(file.canRead()) {
				System.out.println("file is readable..");
			}	else {
				System.out.println("file is not readable..");
			}
			
			if(file.canWrite()) {
				System.out.println("file is writeable..");
			}	else {
				System.out.println("file is not writeable..");
			}
			
			if(file.canExecute()) {
				System.out.println("file is executable..");
			}	else {
				System.out.println("file is not executable..");
			}
		}
	}
}
