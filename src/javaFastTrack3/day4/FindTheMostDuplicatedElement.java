package javaFastTrack3.day4;

public class FindTheMostDuplicatedElement {
	public static void main(String[] args) {
		int[] arr = { 8, 1, 8, 4, 5, 4, 5, 8, 5, 5, 5, 5, 5, 7, 7, 8, 1, 1, 1 };

		// this will count the duplicated numbers
		int count = 0;
		// this will store the largest duplicated number
		int maxCount = 0;
		int mostRecurringElement = arr[0];

		// O(n ^ 2)
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostRecurringElement = arr[i];
			}
		}
		System.out.println(maxCount);
		System.out.println("the most recurring element is " + mostRecurringElement);
		//System.out.println(mostDuplicate(arr));
	}

	// TODO : RE-check the code
//	static int mostDuplicate(int[] arr) {
//		int most = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			int count = 1;
//			for (int j = 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					count++;
//				}
//
//			}
//			if (count > 1) {
//				most = arr[i];
//			}
//		}
//		return most;
//	}
}
