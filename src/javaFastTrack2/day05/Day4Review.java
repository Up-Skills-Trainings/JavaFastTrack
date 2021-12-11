package javaFastTrack2.day05;

import java.util.Arrays;

// knowing the sorting algorithms and talking about them is a huge plus.
public class Day4Review {
	public static void main(String[] args) {

		int[] arr = { 11, 10, 14, 5, 3, 5, 7, 8, 9 };

		// before swapping
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
		int minValue;
		int minValueIndex;

		// time complexity of this algorithm is O(n^2) , we are using nested loops. 
		// the worst case scenoario is O(n!)
		for (int i = 0; i < arr.length; i++) {
			// we are assuming the first index has the lowest number here.
			// we need to do this step to make the comparison with rest of the array in the
			// second loop
			minValue = arr[i];
			minValueIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (minValue > arr[j]) {
					minValue = arr[j];
					minValueIndex = j;
				}
			}

			if (minValue != arr[i]) {
				// we are going to swap two numbers here
				// to be able to do any swapping, we need to create a temp value
				int temp = arr[i];
				arr[i] = minValue;
				arr[minValueIndex] = temp;
			}

			System.out.println(Arrays.toString(arr));
		}

		// after swapping
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
