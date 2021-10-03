package day5;

import java.util.*;

public class TwoSum {
	public static void main(String[] args) {

		// the purpose of that is to find the target number by adding two numbers from
		// the given array
		int[] array = { 1, 2, 3, 4 };
		int targetNumber = 7;
		
		int[] pair = twoSum(array, targetNumber); // I need to return two numbers\
		// this is another way to print the values from the method
		System.out.println(Arrays.toString(twoSum(array, targetNumber))); 
	}

	static int[] twoSum(int[] arr, int target) {
		
		int[] array = new int[2];
		for (int i = 0; i < arr.length; i++) {
			//arr[0] = 1
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					//return the index of the numbers that give us the target number
					array[0] = i;
					array[1] = j;
				}
			}
		}
		//throw new IllegalArgumentException("no matching element");
		
		return array;
	}

}
