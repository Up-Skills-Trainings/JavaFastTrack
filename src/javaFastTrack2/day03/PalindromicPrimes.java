package javaFastTrack2.day03;

import java.util.*;

public class PalindromicPrimes {
	// we want to find the palindromic primes.
	// 313 353 373 383 727 757 787 797 919 929
	public static void main(String[] args) {

		// till 100, I wanna see the PalindromicPrimes numbers
		int limit = 1000;

		boolean isPrime = true;
		boolean isPalindrome = true;

		// we need this to chech the numbers, or to send the number to the methods
		// below.
		for (int number = 2; number < limit; number++) {
			// System.out.println(isPrime(number) + " prime" + number);
			// System.out.println(isPalindrome(number) + " palindrome" + number);

			if (isPalindrome(number) && isPrime(number)) {
				System.out.println(number + " :The number is PalindromicPrime");
			}
		}
	}

	// write a function that returns if a number is prime or not
	static boolean isPrime(int number) {
		boolean isPrime = true;
		for (int divisor = 2; divisor < number; divisor++) {
			if (number % divisor == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPalindrome(int num) {
		String str = "" + num;
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed.equalsIgnoreCase(str);
	}
	// TODO
	// write a function that returns if a number is palindrome or not
//		static boolean isPalindrome(int number) {
//			// TODO
//			// let's say the number is 123321
//			// charAt() >> to be able to use this method, I have to have a string type
//			String str = number + "";
//	
//			if(str.length() == 1) {
//				return true;
//			}
//			
//			if(str.charAt(0) == str.charAt(1)) {
//				return true;
//			}
//			
//			boolean isPalindrome = true;
//			int low = 0;
//			int high = str.length() - 1;
//			for (int i = 0; i < str.length(); i++) {
//				if (str.charAt(low) != str.charAt(high)) {
//					isPalindrome = false;
//					break;
//				}
//				low++;
//				high--;
//			}
//			if (isPalindrome == false) {
//				return false;
//			} else
//				return true;
//		}

}
