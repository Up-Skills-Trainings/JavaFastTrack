package javaFastTrack2.day03;

public class Day2Review {
	public static void main(String[] args) {
		// Palindrome
		recursive(10);

		int a = 10;
		int b = 8;
		System.out.println(sum(a, b));
	}

	static int sum(double a, int b) {
		return (int) (a + b);
	}

	static int sum(int a, double b) {
		return (int) (a + b);
	}

	static void recursive(int a) {

		if (a == 15) {
			return;
		}
		System.out.println(a++);
		recursive(a);
	}

}
