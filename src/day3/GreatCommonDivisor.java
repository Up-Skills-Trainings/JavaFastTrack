package day3;

public class GreatCommonDivisor {

	public static void main(String[] args) {
		// get two numbers and in the output give the gcd
		// 15, 30
		// gcd will be 15

		int num1 = 1450;
		int num2 = 675;

		//System.out.println(gcd(num1, num2));
		int gcd = gcd(num1, num2);
		System.out.println(gcd);
	}

	static int gcd(int num1, int num2) {

		int gcd = 1;

		for (int divisor = 2; divisor < num2 && divisor < num1; divisor++) {
			if (num1 % divisor == 0 && num2 % divisor == 0) {
				gcd = divisor;
			}
		}

		return gcd;

	}

}
