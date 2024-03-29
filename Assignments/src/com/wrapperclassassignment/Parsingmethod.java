package com.wrapperclassassignment;

/*All wrapper classes in java have methods to parse the given string to corresponding primitive data provided the string should be parse-able. 
 * If the string is not parse-able, you will get NumberFormatException. 
 * All parsing methods of wrapper classes are static i.e you can refer them directly using class name.
 */
public class Parsingmethod {

	public static void main(String[] args) {

		byte b = Byte.parseByte("100");
		System.out.println(b); // Output : 100

		short s = Short.parseShort("100");
		System.out.println(s); // Output : 25

		int i = Integer.parseInt("100");
		System.out.println(i); // Output : 123

		long l = Long.parseLong("100");
		System.out.println(l); // Output : 100

		float f = Float.parseFloat("120");
		System.out.println(f); // Output : 12.35

		double d = Double.parseDouble("125");
		System.out.println(d); // Output : 12.87

		boolean bln = Boolean.parseBoolean("true");
		System.out.println(bln); // Output : true

		boolean bln1 = Boolean.parseBoolean("abc");
		System.out.println(bln1); // Output : false

		// char c = Character.parseChar("abc"); //compile time error

		// parseChar() is not defined for Character wrapper class
	}
}