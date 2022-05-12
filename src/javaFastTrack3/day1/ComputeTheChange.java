package javaFastTrack3.day1;

public class ComputeTheChange {
	public static void main(String[] args) {
		/*
		 * Q2: ComputeChange/63
		 * 
		 * Enter an amount, for example: 11.56 Your amount 11.56 consists of 11 dollars
		 * // 100 cents 2 quarters // 25 cents 0 dimes // 10 cents 1 nickels // 5 cents
		 * 1 pennies // a cent
		 */

		double num = 11.56; // if I multiply this guy by 100, i will get something like this 1156

		// two types if casting, explicit (manually), implicit(automatically)

		int numbersInCents = (int) (11.56 * 100); // returns XXXXX1156

		int dollars = numbersInCents / 100; // gives me the dollar amount >> returns 11

		numbersInCents = numbersInCents % 100; // this will return last two digits

		int quarters = numbersInCents / 25; // gives me the quarter amount >> returns 2

		numbersInCents = numbersInCents % 25; // returns the amount less than 25 cents >> returns 6

		int dimes = numbersInCents / 10; // gives me the dimes amount >> returns 0

		numbersInCents = numbersInCents % 10; // returns the amount less than 10 cents >> returns 6

		int nickels = numbersInCents / 5; // gives me the nickels amount >> returns 1

		int pennies = numbersInCents % 5; // gives me the penny ammount

		System.out.println("Dollar amount : " + dollars + "\nQuarter amount : " + quarters + "\nDime amount : " + dimes
				+ "\nNickel amount : " + nickels + "\nPenny amount : " + pennies);

		// casting example
		double db = 20;
		int in = 10;

		in = (int) db;
		db = in;

		System.out.println("=============================");

		// integer overflow, underflow
		int num1 = 2147483647;
		int num2 = -2147483648;
		// overflow
		System.out.println(num1 + 2);
		// underflow
		System.out.println(num2 - 2);
	}
}
