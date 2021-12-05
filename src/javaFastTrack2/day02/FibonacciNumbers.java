package javaFastTrack2.day02;

public class FibonacciNumbers {
	public static void main(String[] args) {
		// Fibonacci Numbers: you are adding the previous value to the next number
		// sum1 sum2 sum
		// 1 1 2 3 5 8 13 21 34 etc...
		// first 50 fibonaccci numbers

		// first number in the number set
		int sum1 = 1;

		// second number in the number set
		int sum2 = 1;

		// third number in the number set
		int sum = 0;
		for (int i = 0; i < 7; i++) {
			sum = sum1 + sum2;
			sum1 = sum2;
			sum2 = sum;
			System.out.print(sum + " ");

		}
		
		System.out.println("\n"+ sum);
	}
}
