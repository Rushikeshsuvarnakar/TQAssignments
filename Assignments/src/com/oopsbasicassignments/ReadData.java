package com.oopsbasicassignments;

import java.util.Scanner;

public class ReadData {

	int rollno;
	String name;
	String clgname;

	void take(int rn, String n, String cn) {
		rollno = rn;
		name = n;
		clgname = cn;
	}

	void show() {
		System.out.println("name=" + name);
		System.out.println("roll no=" + rollno);
		System.out.println("clgname=" + clgname);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReadData ab[] = new ReadData[3];
		for (int i = 1; i < 3; i++) {
			ab[i] = new ReadData();

			System.out.println("enter a roll number");
			int r = sc.nextInt();
			System.out.println("enter a name");
			String n1 = sc.next();
			System.out.println("enter a college name");
			String cn1 = sc.next();
			ab[i].take(r, n1, cn1);
			System.out.println("is your " + i + " object details");
			ab[i].show();
		}

	}

}