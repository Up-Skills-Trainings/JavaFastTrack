package javaFastTrack1.day02;

public class PrimeNumbersWithFor {
	public static void main(String[] args) {

		// Prime number is number that is divisible only by 1 and by itself.
		// starts with 2 and so on
		// I want to see the prime numbers till 1000

		int limit = 100;

		for (int number = 2; number < limit; number++) {
			boolean isPrime = true;
			for (int divisor = 2; divisor < number; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(number + " ");
			}
		}

	}
}
