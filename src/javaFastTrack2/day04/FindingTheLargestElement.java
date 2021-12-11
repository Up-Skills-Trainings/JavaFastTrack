package javaFastTrack2.day04;

import java.util.Arrays;

// if you have some time, practice the "finding the second largest one" question

// finding the smallest index of largest element
// finding the largest index of largest element
public class FindingTheLargestElement {
	public static void main(String[] args) {
		int size = 5;
		int[] array = { 41, 99, 54, 67, 99, 78, 41, 78, 99 };

//		for (int i = 0; i < array.length; i++) {
//			array[i] = (int) (Math.random() * 100);
//		}

		printArray(array);

		// logic >> build here
		int largest = array[0];
		int indexOfTheLargestElement = 0;

		// j starts from "i+1", to check the rest of the array.
		for (int j = 0; j < array.length; j++) {
			// if largest is not greater than the array[j], change the value of largest.
			// if you use the >=, it will return the largest index of largest element
			// if you use the >, it will return the smallest index of largest element
			if (array[j] >= largest) {
				largest = array[j];
				indexOfTheLargestElement = j;
			}
		}

		// printing all the indexes of largest element if there are duplicates
		for (int i = 0; i < array.length; i++) {
			if (array[i] == largest) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println(largest);
		System.out.println(indexOfTheLargestElement);

	}

	private static void printArray(int[] array) {

		for (int each : array) {
			System.out.print(each + " ");
		}
		System.out.println();

	}
}
