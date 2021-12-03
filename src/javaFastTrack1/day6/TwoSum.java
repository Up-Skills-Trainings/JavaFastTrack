package day6;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		int targetNumber = 7;
		
		int[] sol = twoSum(array, targetNumber);
		
		for (int i : sol) {
			System.out.println(i + " ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {

		int[] sol = new int[2];

		HashMap<Integer, Integer> numMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];

			if (numMap.containsKey(diff)) {
				sol[0] = numMap.get(diff);
				sol[1] = i;
				break;

			}
			numMap.put(nums[i], i);
		}
		return sol;
	}

}