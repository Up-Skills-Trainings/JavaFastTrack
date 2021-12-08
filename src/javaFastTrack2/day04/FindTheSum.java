package javaFastTrack2.day04;

public class FindTheSum {
	public static void main(String[] args) {
		
		int[] arr = {5, 7, 8, 9};
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
	}
}
