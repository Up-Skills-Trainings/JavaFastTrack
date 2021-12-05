package javaFastTrack1.day02;

import java.util.Scanner;

public class PalindromeWithWhileLoop {
	public static void main(String[] args) {
		
		// this is a solution for the Palindrome using while loop 
		System.out.println("Enter a number or a word: ");

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int high = str.length() - 1;
		int low = 0;
		boolean isPalindrome = true;

		while (low < high) {
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
