//4. Write a Java program to create Simple Calculator using switch case Menu Driven 

package com.feb_02_switch;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the First num :");
		int num1 = sc.nextInt();
		System.out.println("Enter the second num");
		int num2 = sc.nextInt();
		System.out.println("Select Symbol (+,-,/,*)");
		String symbol = sc.next();
		int result;
		switch (symbol) {
		case "+":
			result = num1 + num2;
			System.out.println("Addition is  :" + result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println("Substraction is :" + result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println("Multiplication is :" + result);
			break;
		case "/":
			result = num1 / num2;
			System.out.println("Division is :" + result);
			break;
		default:
			System.out.println("Invalid Symbol");
			break;

		}

	}

}
