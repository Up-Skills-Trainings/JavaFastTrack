package javaFastTrack3.Day2;

public class PrimeNumbers {
	public static void main(String[] args) {

		// find the prime numbers till 100
		// it can only divisible by itself and 1
		// 2, 3, 5, 7, 11, 13, 17 etc.
		// 1, 2, 3, 4, 5, 6, 7, 8, 9

		int limit = 100;

		for (int prime = 2; prime < limit; prime++) {
			Boolean isPrime = true;
			for (int divisor = 2; divisor < prime; divisor++) {
				if (prime % divisor == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(prime + " ");
			}
		}
	}
}
