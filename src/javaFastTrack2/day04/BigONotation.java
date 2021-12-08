package javaFastTrack2.day04;

public class BigONotation {
// time complexity checks how efficient/fast your code is.
// You can use the Big O notation to show the time complexity of your code.
	public static void main(String[] args) {
		
		int[] array = new int[1000];
		// the time complexity is >> O(n)
 		for (int i = 0; i < array.length; i++) {
			array[i] += 1;
		}
 		
 		// // the time complexity is >> O(n ^ 2)
 		for (int i = 0; i < array.length; i++) {
 			for (int j = 0; j < array.length; j++) {
 				array[j] += 1;
 			}
		}
 		
 		
	}
}
