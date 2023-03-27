package com.operatorsassignments;

public class ComputeTheExpr {

	public static void main(String[] args) {

		float a = 25.5f, b = 3.5f, c = 40.5f, d = 4.5f;
		float answer = ((a * b - b * c) / (c - d));
		System.out.println("Answer =" + answer);
	}

}