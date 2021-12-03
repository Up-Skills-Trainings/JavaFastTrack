package day3;

public class PalindromicPrime {
	public static void main(String[] args) {
		
		// my purpose to find the palindromic primes till number 1000;
		int limit = 1000;
		
		for (int number = 2; number < limit; number++) {
			// if the number is prime and palindrome at the same time
			// then the condition will be true
			String numberToString = number + "";
			if(PrimeNumbersWithMethods.isPrime(number) && DayTwoReview.isPalindrome(numberToString)) {
				System.out.print(number + " ");
			}
		}
	}
}
