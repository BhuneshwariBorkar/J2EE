package com.jspiders.designpattern.creational.buildermain;

import com.jspiders.designpattern.creational.builder.Contact;
import com.jspiders.designpattern.creational.builder.ContactBuilder;

public class ContactMain {
	public static void main(String[] args) {
		Contact contact = new ContactBuilder().setFirstName("Ram").setMobile(1232589385l).buildContact();
		System.out.println(contact);
	}
}