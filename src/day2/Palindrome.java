package day2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter a number or a word: ");
		
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		int high = str.length() - 1;
		int low = 0;
		Boolean isPalindrome = true;
		
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(low) != str.charAt(high)) {
				isPalindrome = false;
				System.out.println("not palindrome");
				break;
			}
			low++;
			high--;
		}
		
		if(isPalindrome) {
			System.out.println("It is a palindrome");
		}
		
	}
}
