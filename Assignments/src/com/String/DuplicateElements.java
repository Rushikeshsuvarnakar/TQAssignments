package com.String;

public class DuplicateElements {

	public static void main(String[] args) {
		String arr[] = { "java", "c", "c++", "java", "Paython" };
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Found Duplicate elements :" + arr[i]);
					flag = true;
				}
			}
		}
		if (flag = false) {
			System.out.println("Duplicate elemnts not found");
		}

	}

}
