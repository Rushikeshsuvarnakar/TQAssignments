package com.oopsbasicassignments;


public class VolumeOfBox {

	float length;
	float width;
	float height;

	void take(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

	void volume() {
		float vl = (length * width * height);
		System.out.println("volume=" + vl);
	}

	public static void main(String[] args) {

		VolumeOfBox v = new VolumeOfBox();
		v.take(25, 42, 56);
		v.volume();

	}

}