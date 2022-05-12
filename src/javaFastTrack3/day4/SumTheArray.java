package javaFastTrack3.day4;

public class SumTheArray {
	public static void main(String[] args) {
		// given an array, sum the value of the elements of the array
		int[] number = {3, 5, 6, 7};
		
		// this is not an array, this is an integer
		// sumArray(number[0]);
		
		System.out.println(sumArray(number));
	}
	

	static int sumArray(int[] thisArray) {
		
		int sum = 0;
		
		for (int each : thisArray) {
			sum += each;
		}
		
//		for (int i = 0; i < thisArray.length; i++) {
//			sum += thisArray[i];
//		}
		
		return sum;
	}
	

	static int sumArray(int num) {
		return 0;
	}
}
