//2.Write a Java program to check whether a number is even or odd using switch case 
package com.feb_02_switch;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		switch (num % 2) {
		case 1:
			System.out.println(num + "is odd number");
			break;
		default:
			System.out.println(num + "is even number ");
		}
		sc.close();
	}

}
