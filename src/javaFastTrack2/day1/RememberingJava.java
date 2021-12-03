package course2_day1;

//import java.util.List;

public class RememberingJava {

	public static void main(String[] args) {
		// Why Java is the most common language
		// 1. Java is the platform independent language (motto: write once, run
		// everywhere)
		// 2. There is no memory manipulatin in Java
		// 3. Great OOP structure.

		// Literals in Java
		// 1. Integer Literal >> int, double, etc..
		// 2. String Literal >> character array

		// What is a Java Package and which package is imported by default?
		String abc = "hello";

		// Why Java is not a pure Object Oriented language?
		// since we have primitive data types, Java is not a pure Object Oriented
		// language
		int num = 5;

		// What is a "final" keyword?
		// final makes it immutable
		// What implicit casting, explicit casting?
		int num1 = 10;

		double num2 = 20;

		// 2147483647, -2147483648
		// explicit casting
		num1 = (int) num2;

		double num3 = 20;

		// implicit casting
		num3 = num2;

		// What is an integer overflow and underflow?
		// integer overflow
		int number = 2147483647; // -2147483648 to 2147483647.
		int number2 = number + 2;
		System.out.println("integer overflow " + number2);

		// integer underflow
		int number3 = -2147483648; // -2147483648 to 2147483647.
		int number4 = number3 - 2;
		System.out.println("integer underflow " + number4);
	}

}
