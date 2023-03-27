package com.oopsbasicassignments;

public class MultipleObjectSameClass {

	float height;
	float weight;
	String name;

	void takeShow(float height1, float weight1, String s) {
		height = height1;
		weight = weight1;
		name = s;
		System.out.println("name=" + name);
		System.out.println("height=" + height + " cm");
		System.out.println("weight=" + weight + " kg");
	}

	public static void main(String[] args) {
		MultipleObjectSameClass m1 = new MultipleObjectSameClass();
		MultipleObjectSameClass m2 = new MultipleObjectSameClass();
		m1.takeShow(169, 62, "suraj");
		m2.takeShow(178, 78, "awari");

	}

}