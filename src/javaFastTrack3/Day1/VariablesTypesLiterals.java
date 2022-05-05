package javaFastTrack3.Day1;

public class VariablesTypesLiterals {
	// Types
	// Two types we have,
	// 1 primitive type, 2 non-primitive type
	public static void main(String[] args) {
		int number = 10;
		// byte, short, int, char, float, long, double, boolean
		/*
		 * Non-primitive data types are called reference types because they refer to
		 * objects.
		 * 
		 * The main difference between primitive and non-primitive data types are:
		 * 
		 * Primitive types are predefined (already defined) in Java. Non-primitive types
		 * are created by the programmer and is not defined by Java (except for String).
		 * Non-primitive types can be used to call methods to perform certain
		 * operations, while primitive types cannot. A primitive type has always a
		 * value, while non-primitive types can be null. A primitive type starts with a
		 * lowercase letter, while non-primitive types starts with an uppercase letter.
		 * The size of a primitive type depends on the data type, while non-primitive
		 * types have all the same size.
		 * 
		 */

		String str = "hello";
		str.charAt(0);

		// A primitive type has always a
		// value, while non-primitive types can be null
		int[] arr = new int[10];
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		//Variables: byte, short, int, char, float, long, double, boolean
		int variableName1 = 10;
		double variableName2 = 20.9;
		
		//Literals >> Numeric, String, Boolean, Char
		// You can not change the final class
		// You can not extend the final class
		System.out.print("whatever");
	}
}
