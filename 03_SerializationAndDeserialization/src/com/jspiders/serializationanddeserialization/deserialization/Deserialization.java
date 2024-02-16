package com.jspiders.serializationanddeserialization.deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspiders.serializationanddeserialization.object.User;

public class Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("E:\\ADV_JAVA_Test\\J2EE\\03_SerializationAndDeserialization\\db_info.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		User user =  (User) objectInputStream.readObject();
		System.out.println(user);
		fileInputStream.close();
		objectInputStream.close();
	}
}
