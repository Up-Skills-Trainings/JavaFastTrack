package javaFastTrack1.day02;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// Palindrome is the word or a number that is same when you read from forward to
		// backward
		// or vice versa
		// 1112111, level, saippuakivikauppias, 12344321, madam, anna, madam madam

		System.out.println("Enter a number or a word: ");
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();

		int high = str.length() - 1;
		int low = 0;
		boolean isPalindrome = true;

		for (int i = 0; i < str.length() - 1 / 2; i++) {
			if (str.charAt(low) != str.charAt(high)) {
				isPalindrome = false;
				System.out.println("This is not a palindrome....");
				break;
			}
			low++;
			high--;
		}

		if (isPalindrome) {
			System.out.println("The input is a palindrome... ");
		}

	}
}
