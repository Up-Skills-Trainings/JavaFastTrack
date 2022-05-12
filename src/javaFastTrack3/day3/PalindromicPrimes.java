package javaFastTrack3.day3;

public class PalindromicPrimes {
	public static void main(String[] args) {

		// find the prime numbers till 100
		// it can only divisible by itself and 1
		// 2, 3, 5, 7, 11, 13, 17 etc.
		// 1, 2, 3, 4, 5, 6, 7, 8, 9

		int limit = 100000;

		for (int prime = 2; prime < limit; prime++) {
			Boolean isPrime = true;
			for (int divisor = 2; divisor < prime; divisor++) {
				if (prime % divisor == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime && isPalindrome(prime)) {
				// System.out.print(prime + " ");
				System.out.println("This is a palindromic prime" + prime);
			}
		}

	}

	private static boolean isPalindrome(int prime) {
		String str = prime + "";
		int low = 0;
		int high = str.length() - 1;

		Boolean isPalindrome = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(low) != str.charAt(high)) {
				isPalindrome = false;
				break;
			}
			low++;
			high--;

		}

		return isPalindrome ? true : false;
	}

}
