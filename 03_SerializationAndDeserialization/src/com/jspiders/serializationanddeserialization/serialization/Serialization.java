package com.jspiders.serializationanddeserialization.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jspiders.serializationanddeserialization.object.User;

public class Serialization {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\ADV_JAVA_Test\\J2EE\\03_SerializationAndDeserialization\\db_info.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new User(1,"Bhumi","bhumi@gmail.com",7447581173l));
		System.out.println("Object has tobe serialized");
		fileOutputStream.close();
		objectOutputStream.close();
	}
}
