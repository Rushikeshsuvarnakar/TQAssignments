package com.oopsmethodsassignment;

import java.util.Scanner;

public class Onemethodcallinganother {

	int id;

	int getid(int i) {
		id = i;
		return id;
	}

	void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id");
		int i1 = sc.nextInt();
		int ans = getid(i1);
		System.out.println("id=" + ans);
	}

	public static void main(String[] args) {

		Onemethodcallinganother o = new Onemethodcallinganother();
		o.display();

	}

}