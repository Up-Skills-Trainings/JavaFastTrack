package course2_day1;

import java.util.*;

public class ComputeChange {
	/*
	 * ComputeChange/63
	 * 
	 * Enter an amount, for example: 11.56 Your amount 11.56 consists of 11 dollars
	 * 2 quarters 0 dimes 1 nickels 1 cent
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double num = input.nextDouble(); // 11.56

		// we need to multiply the number with 100 to get the cents form of the number
		num = (int) (num * 100); // 1156

		// divide by 100 to find the dollars
		int dollars = (int) (num / 100); // 11

		// to remove the dollars, get the reminder of 100
		num %= 100; // 56

		// divide by 25 to find the quarters
		int quarters = (int) (num / 25); // 2

		// to remove the quarters, get the reminder of 25
		num %= 25; // 6

		// divide by 10 to find the dimes(10 cents)
		int dimes = (int) (num / 10); // 0

		// to remove the dimes, get the reminder of 10
		num %= 10; // 6

		// divide by 5 to find the nickels(5 cents)
		int nickels = (int) (num / 5); // 1

		// to remove the nickels, get the reminder of 5
		num %= 5; // 1

		int cents = (int) num;

		System.out.println("One dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Cents: " + cents);

	}
}
