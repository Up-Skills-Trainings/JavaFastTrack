package javaFastTrack1.day01;

import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args) {
		/*
		 * ComputeChange
		 * 
		 * Enter an amount, for example: 11.56 Your amount 11.56 consists of 
		 * 11 dollars
		 * 2 quarters 
		 * 0 dimes 
		 * 1 nickels 1 pennies
		 * 
		 */
		
		// Always ask questions to the interviewer that you understood the problem
		
		System.out.println("Enter an amount: ");
		
		Scanner input = new Scanner(System.in);
		
		double num = input.nextDouble(); // 11.56
		
		int newNumber = (int)(num * 100); // it gives me the cent value of the money >> 1156
		
		// one dollar
		int oneDollars = newNumber / 100;
		
		// remove the one dollars from the number
		newNumber = newNumber % 100; // it will return 56 cents
		
		int quarters = newNumber / 25; // it will return 2
		
		//remove the quarters from the number
		newNumber = newNumber % 25; // it will return 6 cents
		
		// find the dimes
		int dimes = newNumber / 10; // it will return 0 here
		
		//remove the dimes from the number (10 cents)
		newNumber = newNumber % 10; // it will return 6 cents
		
		// find the nickels
		int nickels = newNumber / 5; // it will return 1 here
		
		//remove the nickels from the number (5 cents)
		newNumber = newNumber % 5; // it will return 1 cent
		
		// the remaining number is all about the pennies
		int pennies = newNumber; // it will return 1 here
		
		System.out.println("One dollars: " + oneDollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
	}
}
