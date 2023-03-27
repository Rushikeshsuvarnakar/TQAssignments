package com.oopsbasicassignments;

public class InitializingThroughReference {

	int no;
	String name;
	float salary;

	public static void main(String[] args) {
		InitializingThroughReference a = new InitializingThroughReference();
		a.no = 5;
		a.name = "Suraj";
		a.salary = 50000;
		System.out.println("number=" + a.no);
		System.out.println("name=" + a.name);
		System.out.println("Salary=" + a.salary);
	}

}