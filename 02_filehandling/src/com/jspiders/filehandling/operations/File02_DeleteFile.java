// file is present -- check using exist() and delete using -- delete()
package com.jspiders.filehandling.operations;

import java.io.File;

public class File02_DeleteFile {
	public static void main(String[] args) {
		File file = new File("E:\\ADV_JAVA_Test\\J2EE\\02_filehandling\\info.txt");
		
		if(file.exists()) {
			System.out.println("File is exist");
			boolean status = file.delete();
			System.out.println(status);
			if(status) {
				System.out.println("File Deleted..");
			} else {
				System.out.println("file is not deleted");
			}
		} else {
			System.out.println("file is not exist");
		}
	}
}
