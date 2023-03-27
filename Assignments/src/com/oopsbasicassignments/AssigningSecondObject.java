package com.oopsbasicassignments;

public class AssigningSecondObject {

	int num1;
	int num2;

	void set(int n1, int n2) {
		num1 = n1;
		num2 = n2;

	}

	void show() {
		System.out.println("value of num1=" + num1);
		System.out.println("value of num2=" + num2);
	}

	public static void main(String[] args) {
		AssigningSecondObject a1 = new AssigningSecondObject();
		AssigningSecondObject a2 = a1; // does not creating separate memory block

		System.out.println("first object");
		a1.set(45, 400);
		a1.show();
		System.out.println("-------------");
		System.out.println("second object");
		a2.set(41, 600);
		a2.show();
		a1.show();

	}

}
/*
 * create second object and assign to the first and check it wiil creating a new
 * memory space or not
 */