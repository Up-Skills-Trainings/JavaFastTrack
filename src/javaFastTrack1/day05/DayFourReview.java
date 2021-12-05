package javaFastTrack1.day05;

public class DayFourReview {
	// find the fist duplicated element from the given array
	// {1, 2, 2, 2, 3, 4, 1, 1, 2, 2, 5, 6, 6, 6}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 1, 6, 6 };
		int number = method(array);

		System.out.println(number);
	}

	static int method(int[] array) {

		int firstDuplicated = 0;
		// this is how we read the for each loop
		// integer type of each element from the array
		for (int each : array) {
			int count = 0;
			for (int each2 : array) {
				if (each == each2) {
					count++;
				}
			}

			if (count > 1) {
				firstDuplicated = each;
				break;
			}
		}
		return firstDuplicated;
	}
}
// after solving the question, please ask interviewer if he or she has a suggestion