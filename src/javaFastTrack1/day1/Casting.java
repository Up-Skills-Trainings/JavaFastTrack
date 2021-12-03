package day1;

public class Casting {
	public static void main(String[] args) {
		// What is an integer overflow and underflow?

		// integer overflow//
		int number = 2147483647; // -2147483648 to 2147483647.
		int number2 = number + 2;
		System.out.println(number2);

		// integer underflow
		int number3 = -2147483648; // -2147483648 to 2147483647.
		int number4 = number3 - 1;
		System.out.println(number4);

	}
}
