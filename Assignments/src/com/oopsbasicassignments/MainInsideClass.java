package com.oopsbasicassignments;

public class MainInsideClass {

	int rollno;
	String name;

	void takeDetails(int rn, String n) {
		rollno = rn;
		name = n;

	}

	void showDetails() {
		System.out.println("roll number=" + rollno);
		System.out.println("name=" + name);
	}

	public static void main(String[] args) {

		MainInsideClass m1 = new MainInsideClass();
		m1.takeDetails(45, "suraj");
		m1.showDetails();
	}

}