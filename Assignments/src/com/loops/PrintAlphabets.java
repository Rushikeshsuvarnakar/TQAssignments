package com.loops;

public class PrintAlphabets {

	public static void main(String[] args) {

		char ch = 'A';
		char ch1 = 'Z';
		for (char i = ch; i <= ch1; i++) {
			System.out.print(ch);
			System.out.print(" ");
			ch++;
		}

	}

}