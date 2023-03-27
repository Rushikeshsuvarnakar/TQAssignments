//3. Write a Java program to input any alphabet and check whether it is vowel or consonant 

package com.feb_02_switch;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		String ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		ch = sc.next();

		switch (ch) {
		case "a":
			System.out.println("vowel");
			break;
		case "e":
			System.out.println("vowel");
			break;
		case "i":
			System.out.println("vowel");
			break;
		case "o":
			System.out.println("vowel");
			break;
		case "u":
			System.out.println("vowel");
			break;
		default:
			System.out.println("Consonat");
		}
	}

}
