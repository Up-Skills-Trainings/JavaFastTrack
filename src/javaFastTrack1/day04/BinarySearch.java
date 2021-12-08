package javaFastTrack1.day04;

public class BinarySearch {
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}

		return low;
	}

	public static void main(String[] args) {
		int[] list = { -3, 1, 2, 3, 4, 5, 7, 8, 9, 23, 45, 67, 99};
		System.out.println(binarySearch(list, 23));
	}
}
