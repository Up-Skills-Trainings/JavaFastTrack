package javaFastTrack1.day04;

public class FindTheMostRecurringElement {
	public static void main(String[] args) {
		// you have a given array and find the most recurring element from the array
		// {1, 1, 2, 2, 2, 3, 4, 1, 1, 2, 2, 5, 6, 6, 6}

		int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 4, 1, 1, 2, 2, 5, 6, 6, 6, 6, 6, 6, 6, 6};

		// this returns the most popular number,
		// for starting point, I assigned the first element as my popular number
		int mostDuplicate = arr[0];
		
		// it will keep the value of the max count
		int maxCount = 0;
		
		// it will make the count for each element, and we need to assign that value to the maxCount 
		// if it is greater than maxCount 
		int tempCount;

		// time complexity is O(n^2)
		for (int i = 0; i < arr.length; i++) {
			// we need to put zero every-time to the tempCount, 
			//then it will start to count very element from the zero
			tempCount = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					tempCount++;
				}
			}

			if (tempCount > maxCount) {
				maxCount = tempCount;
				mostDuplicate = arr[i];
			}
		}
		System.out.println(mostDuplicate);

	}

}
