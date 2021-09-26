package day3;

import java.util.Scanner;

public class DayTwoReview {
	public static void main(String[] args) {
		/*
		 * Write a code that checks the word or a number, if they are palindrome or not.
		 */

		// 123321, madam

		System.out.println("Enter a number or a word: ");

		Scanner input = new Scanner(System.in);

		String str = input.nextLine();

		int low = 0; // first index
		int high = str.length() - 1; // last index
		boolean isPalindrome = true;

		// divided by two logic is to save from the time. 
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(low) != str.charAt(high)) {
				isPalindrome = false;
				System.out.println("not a palindrome");
				break;
			}
			// low will get closer to the last index
			low++; // if I do this, the next index will be the index 2 to be checked
			high--; // it will get closer to the first index
		}

		if (isPalindrome) {
			System.out.println("The input is a palindrome");
		}

	}
}
