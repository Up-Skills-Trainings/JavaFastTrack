package day2;

import java.util.Scanner;

public class FindingPalindromes {
	public static void main(String[] args) {
		// madam >> is a Palindrome
		// 1234321
		// tattarrattat

		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		boolean isPalindrome = true;

		int lastIndex = str.length() - 1;
		int firstIndex = 0;

		// our condition is to check the first half of the string
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(firstIndex) != str.charAt(lastIndex)) {
				isPalindrome = false;
				break;
			}
			lastIndex--;
			firstIndex++;
			
		}

		System.out.println("The input is: " + isPalindrome);
	}
}
