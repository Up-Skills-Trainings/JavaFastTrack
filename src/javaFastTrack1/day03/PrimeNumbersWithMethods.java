package javaFastTrack1.day03;

public class PrimeNumbersWithMethods {
	public static void main(String[] args) {
		// Prime number is number that is divisible only by 1 and by itself.
		// starts with 2 and so on
		// I want to see the prime numbers till 1000

		int limit = 100;
		primeNumbers(limit);

	}
	
	// this method returns the number of prime of numbers that's been given by the user.
	public static void primeNumbers(int limit) {
		for (int number = 2; number < limit; number++) {
			if (isPrime(number)) {
				System.out.print(number + " ");
			}
		}
	}

	public static boolean isPrime(int num) {

		// prime is should be greater than 1
		if (num <= 1) {
			System.out.println("The number can not be less than 1, ");
			return false;
		}
		// prime number can be divided by itself
		for (int divisor = 2; divisor < num; divisor++) {
			if (num % divisor == 0)
				return false;
		}

		return true;
	}
}
