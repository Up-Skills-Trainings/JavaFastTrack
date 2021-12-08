package javaFastTrack2.day04;

public class FindingTheMostDuplicate {

	public static void main(String[] args) {
		// you have a given array and find the most recurring element from the array
		// {1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 1, 1, 2, 2, 5, 6, 6, 6}

		int[] arr = { 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 1, 1, 2, 2, 5, 6, 6, 6 };

		// it counts every element
		int count = 0;
		
		// this holds the element with the most recurring
		int mostRecurringElement = arr[0];
		
		// it gets the highest number for the count. 
		int maxCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			// reset this value to the "zero" every time
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				// this logic checks for the duplicate one
				if(arr[i] == arr[j]) {
					// this increases if the arr[i] equals to the arr[j]
					count++;
				}
			}
			
			// this guy checks if the current "count" is greater than "maxCount";
			if(count > maxCount) {
				maxCount = count;
				mostRecurringElement = arr[i];
			}
		}
		System.out.println(maxCount);
		System.out.println(mostRecurringElement);
	}

}
