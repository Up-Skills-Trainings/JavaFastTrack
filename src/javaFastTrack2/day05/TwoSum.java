package javaFastTrack2.day05;

public class TwoSum {

	public static void main(String[] args) {
		// in a given array and a given target number, your code should return the
		// indexes of elements
		// that give the target number when you sum them up.
		
		int[] array = { 11, 10, 14, 5, 7, 8, 3, 9 };
		int target = 8;
		
		int firstIndex = -1;
		int secondIndex = -1;
		
		// O(n^2)
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				
				int missingNumber = target - array[i];
				
				if(array[j] == missingNumber) {
					firstIndex = i;
					secondIndex = j;
				}
			}
		}
		
		System.out.println("firstIndex: " + firstIndex + " \nsecondIndex: " + secondIndex);

	}

}

