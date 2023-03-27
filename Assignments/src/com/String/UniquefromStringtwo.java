package com.String;

import java.util.Scanner;

public class UniquefromStringtwo {
	static Scanner sc = new Scanner(System.in);

	public static void checkTwoString(String s3[], String s4[]) {
		boolean flag = false;
		for (String s : s4) {
			flag = false;
			for (String s1 : s3) {
				if (s1.equals(s)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		String s1[] = { "Rushikesh", "abhi", "kishor", "Nutesh" };
		String s2[] = { "Avi", "Amit", "Rushikesh", "Ravi" };
		checkTwoString(s1, s2);
	}

}