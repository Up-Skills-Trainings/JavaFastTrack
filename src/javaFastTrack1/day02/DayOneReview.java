package javaFastTrack1.day02;

import java.util.*;

public class DayOneReview {
	public static void main(String[] args) {

		// TASK
		/*
		 * Suppose a string string contains the first name and last name separated by a
		 * space. Write a code that separates the first name and last name.
		 * 
		 * Example: Enter first name and last name: Py Charm Py Charm
		 * 
		 * Tip: string.indexOf(' ') >> returns the index of white space
		 * 
		 */
		System.out.println("Enter the first name and the last name: ");

		Scanner input = new Scanner(System.in);

		// String name = input.next(); // if we use the next() it will only return the
		// first word
		String name = input.nextLine(); // it will return the whole line

		// name >> Py Charm, Hello Cydeo
		// to make the seperation, I need to do a string manipulation
		
		int indexOfWhiteSpace = name.indexOf(' ');
		
		String firstName = name.substring(0, indexOfWhiteSpace);
		String lastName = name.substring(indexOfWhiteSpace + 1, name.length());
		
		System.out.println(firstName);
		System.out.println(lastName);
	}
}
