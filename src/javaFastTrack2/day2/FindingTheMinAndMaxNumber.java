package day2;

import java.util.Scanner;

public class FindingTheMinAndMaxNumber {
	public static void main(String[] args) {
		// Get the input(integers) from the user, and find the max value and min value
		// if user enters 0, break the loop

		/*
		 * 
		 * Scanner input = new Scanner(System.in); int number, max; number =
		 * input.nextInt(); max = number; while (number != 0) { number =
		 * input.nextInt(); if (number > max) max = number; }
		 * System.out.println("max is " + max); System.out.println("number " + number);
		 */
		System.out.println("Enter some numbers: ");
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		// we are assuming that first given number is my max value
		int max = number;
		
		while (number != 0) { 
			number = input.nextInt();
			if(number > max) {
				// my new max value will be the next input
				max = number;
			}
		}
		
		System.out.println("The max value is: " + max);
				


	}
}
