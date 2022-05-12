package javaFastTrack3.day1;

public class SumTheDigits {
	public static void main(String[] args) {
		/*
		 * Q1: (Sum the digits in an integer) Write a program that reads an integer
		 * between 0 and 1000 and adds all the digits in the integer. For example, if an
		 * integer is 932, the sum of all its digits is 14.
		 * 
		 * NOTE: We will need to solve this without using loops.
		 * 
		 * Hint: Use the % operator to extract digits, and use the / operator to remove
		 * the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
		 * 
		 * Here is a sample run: Enter a number between 0 and 1000: 999 The sum of the
		 * digits is 27
		 */
		// 1 + 1 + 2 + 3 + 5 + 8
		int number = 6; // 9 + 9 + 9 = 27
						// 233 >> 2 + 3 + 3 = 8
		
		int thirdDigit = number / 100; // 9 >> add this numbr 
		
		int remainingNumber = number % 100; // 87 >> this is not to add, this is just to find the next number to make operation
		
		int secondDigit = remainingNumber / 10; // 8 >> add this number 
		
		remainingNumber = remainingNumber % 10; // 7 >> this is not to add, this is just to find the next number to make operation
		
		int firstDigit = remainingNumber / 1; // 7 add this number
		
		int sum = firstDigit + secondDigit + thirdDigit;
		
		System.out.println("The sum of the digits are: " + sum);
		
		
	}
}
