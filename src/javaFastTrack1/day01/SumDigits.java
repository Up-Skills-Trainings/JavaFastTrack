package javaFastTrack1.day01;

import java.util.Scanner;

public class SumDigits {
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
		
		System.out.println("Enter a number between 0 and 1000: ");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		int sum = 0;
		
		//987
		sum += number % 10; // sum = 7
		number = number / 10; //98
		
		sum += number % 10; // sum = 15
		number /= 10; // 9
		
		sum += number; // 24
		
		System.out.println(sum);
		

	}
}
