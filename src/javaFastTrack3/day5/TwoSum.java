package javaFastTrack3.day5;

// practice with the "leetcode" 
public class TwoSum {
	public static void main(String[] args) {
		// given an integer array, and a target number
		// return the only two indexes and numbers that give you the target number by
		// adding them

		int[] arr = { 7, 1, 4, 6, 8 };
		int target = 11;

		int[] sol = twoSum(arr, target);

		System.out.println(
				"The indexes are " + sol[0] + " " + sol[1] + " and values are " + arr[sol[0]] + " " + arr[sol[1]]);

	}

	static int[] twoSum(int[] arr, int number) {

		// O(n ^ 2) >> this is the time complexity
		// brute-force solution
		int firstIndex = 0;
		int secondIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == number) {
					firstIndex = i;
					secondIndex = j;

				}
			}
		}

		return new int[] { firstIndex, secondIndex };
	}
}
