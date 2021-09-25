package day1;

public class TypeCasting {
	/*
	 * Widening Casting (automatically) - converting a smaller type to a larger type
	 * size byte -> short -> char -> int -> long -> float -> double
	 * 
	 * Narrowing Casting (manually) - converting a larger type to a smaller size
	 * type double -> float -> long -> int -> char -> short -> byte
	 */

	public static void main(String[] args) {
		// Java is not a pure OOP language >> because we have primitive types in Java

		int num = 10;
		double num1 = 20;

		// if we know the number we want to convert takes enough space from the memory,
		// then we can do explicit casting.
		num = (int) num1;

		// this is an implicit casting, it happens automatically
		num1 = num;

	}
}
