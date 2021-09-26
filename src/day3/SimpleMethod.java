package day3;

public class SimpleMethod {
	public static void main(String[] args) {
		double num1 = 12.2;
		int num2 = 10;
		int num3 = 8;
		max(num1, num2);
		max(num2, num3);
		max(num3, num1);
	}

	// method overloading,
	static double max(double num1, int num2) {
		
		// ternary operator
		return (num1 <= num2) ? num2 : num1;

	}

	// method overloading,
	static int max(int num1, int num2) {

		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}

	}

	// method overloading,
	// when we change the parameter type, and keep the name same,
	// it will be method overloading.
	static double max(int num1, double num2) {

		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}

	}

}
