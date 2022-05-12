package javaFastTrack3.day4;

import java.util.*;

public class Day3Review {
	public static void main(String[] args) {
		// Arrays stores the data in it.
		int[] number = new int[5];

		int[] num1;
		
		// must be initialized
		// num1[0] = 8;

		// assign a random value to the array here
		for (int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random() * 100);
		}

		// print the array on the console
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

		System.out.println("\n==========================");

		// create an array and assign a random value to the array here
		int[] number2 = new int[5];
		for (int i = 0; i < number2.length; i++) {
			number2[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < number2.length; i++) {
			System.out.print(number2[i] + " ");
		}

		// copying the array, this does not make a copy of the array
		number2 = number;
		
		// this is how we can copy the arrays
		// reach out to the each index, and assign the value of the array to that index
		for (int i = 0; i < number2.length; i++) {
			number2[i] = number[i];
		}

		// for each loops are easier to use for the print out statements 
		for (int each : number2) {
			System.out.print(each + " ");
		}
	}
}
