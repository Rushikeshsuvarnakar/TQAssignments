package com.feb_02_switch;

//1. Write a Java program print total number of days in a month using switch case 

//Input-12,output-jan=32Days

public class NumberDays {

	public static void main(String[] args) {

		int num = 1;
		switch (num) {
		case 1:
			System.out.print("jan=31 Days");
			break;

		case 2:
			System.out.print("Feb=28 Days");
			break;

		case 3:
			System.out.print("March=30 Days");
			break;

		case 4:
			System.out.print("April=31Days");
			break;

		case 5:
			System.out.print("May=30 Days");
			break;

		case 6:
			System.out.print("jun=31 Days");
			break;

		case 7:
			System.out.print("july=30Days");
			break;

		case 8:
			System.out.print("August=31 Days");
			break;

		case 9:
			System.out.print("Septaber=30Days");
			break;

		case 10:
			System.out.print("octber=31 Days");
			break;

		case 11:
			System.out.print("November=30 Days");
			break;

		case 12:
			System.out.print("December=31 Days");
			break;

		default:
			System.out.print("Invalid input!");
		}

	}

}