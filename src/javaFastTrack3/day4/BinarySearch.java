package javaFastTrack3.day4;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = {3, 8, 13, 18, 43, 44, 58, 60, 68, 78, 81};
		
		System.out.println(binarySearch(array, 43));
	}

	static int binarySearch(int[] arr, int key) {

		int low = 0;
		int high = arr.length - 1;

		while (high >= low) {
			
			int mid = (low + high) / 2;

			if (key < arr[mid]) {
				high = mid - 1;
			} else if (key == arr[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}
}
