package javaFastTrack3.day4;

public class BigONotation {
	public static void main(String[] args) {
		// Big O notation, this is an expression that states how efficent
		// your algorithm is.
		// O(n) >> that means, based on the number of ("n") data
		// your time complexity will increase

		double[] array1 = new double[1000000];

		int sum = 0;

		// time complexity is >> O(n)
		// 1000 times here
		for (int i = 0; i < array1.length; i++) {
			array1[i] += 1;
		}

		// time complexity is >> O(n ^ 2)
		// 1000 x 1000 times here
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				array1[j] += 1;
			}
		}
		
		// to get the value of the last index of the given array
		// what is going to be O(?) >> O(1)
		double lastIndex = array1[array1.length - 1];
		

	}
}
