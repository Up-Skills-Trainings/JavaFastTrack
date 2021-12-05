package javaFastTrack2.day01;

import java.util.*; // * means "all"

public class SumTheDigits {

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
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 1000: ");

		int num = input.nextInt(); // 932

		int firstDigit = num % 10; // 2

		num = num / 10; // 93

		int secondDigit = num % 10; // 3

		num /= 10; // 9
		
		int thirdDigit = num % 10; // 9
		
		int sum = firstDigit + secondDigit + thirdDigit;
		
		System.out.println(sum);
	}

}
