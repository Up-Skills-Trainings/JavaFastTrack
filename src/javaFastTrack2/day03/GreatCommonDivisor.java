package javaFastTrack2.day03;

public class GreatCommonDivisor {
	public static void main(String[] args) {

		/* Find the GreatCommonDivisor of given two numbers */
		// 50, 100
		// 75 > 5, 25, 75
		// 100 > 2, 5, 10, 25, 50, 100
		// greatest divisor is the 25 above, so our logic should print 25 in the output

		int a = 75;
		int b = 100;
		System.out.println(gcd(a, b));
		
		int num1 = 36;
		int num2 = 108;
		System.out.println(gcd(num1, num2));
	}

	private static int gcd(int a, int b) {
		// greatest common divisor, I assigned 1 to the gcd
		int gcd = 1;
		
		// finding the small number to use in the condition of the if statement
		// by using min method from the Math class. 
		int minNumber = Math.min(a, b);
		for (int divisor = 2; divisor <= minNumber; divisor++) {
			// using the && logic, number a and number b must be divisible by divisor 
			if (a % divisor == 0 && b % divisor == 0) {
				// assign the value of divisor to the gcd. 
				gcd = divisor;
			}
		}
		return gcd;
	}
}
