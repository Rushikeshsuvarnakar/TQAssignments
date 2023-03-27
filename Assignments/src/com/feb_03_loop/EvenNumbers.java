//3.	 WAP to print even numbers from 121 to 229 using do-while loop. 
package com.feb_03_loop;

public class EvenNumbers {

	public static void main(String[] args) {
		int n = 229;
		int i = 121;
		do {
			if (i % 2 == 0) {
				System.out.println(i + "");
			}
			i++;
		} while (n > i);

	}

}
