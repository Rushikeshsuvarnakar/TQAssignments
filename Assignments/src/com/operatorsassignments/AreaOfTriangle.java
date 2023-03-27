package com.operatorsassignments;

//import java.lang.Math;
import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a side of triangle");
		float side = sc.nextFloat();
		double area = (Math.sqrt(3) * (side * side));
		System.out.println("Area of Equilateral trianbgle is= " + area);
	}

}