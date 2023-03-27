//write java program for switch experession is of string type 
package com.feb_02_switch;

public class StringType {

	public static void main(String[] args) {
		String color = "Black";
		switch (color) {
		case "red":
			System.out.println("You chose the color red :");
			break;
		case "blue":
			System.out.println("you chose the color blue");
			break;
		case "green":
			System.out.println("you chose the color green");
			break;
		default:
			System.out.println("You chose a different color:");

		}

	}

}
