package com.oopsbasicassignments;

//anonymous object means object crating without giving a name
public class AnonymousObject {

	String pname;
	int age;

	void takeAndDisplay(String pn, int ag) {
		pname = pn;
		age = ag;
		System.out.println("person name=" + pname + " " + "age=" + age);
	}

	public static void main(String[] args) {
		new AnonymousObject().takeAndDisplay("Suraj", 35);
	}

}