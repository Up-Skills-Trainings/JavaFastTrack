package javaFastTrack3.Day3;

public class Arrays {
	public static void main(String[] args) {
		// we do have to give a size in the arrays
		// but in the array list there no size required.
		// in the arrays we have initial value, but arraylist no initial value
		
		int[] arr = new int[10]; // >> int[0] = 0
		
		double[] db = new double[9];
		
		int[] array = new int[50];
		
		for (int i = 0; i < array.length; i++) {
						// returns something between 0 and 1, 0.9 >> 99.878897
			array[i] = (int)(Math.random() * 100);
			System.out.print(array[i] + " ");
		}
		
		// from the array above, find the largest number from that array
		// only return the last one
		System.out.println("The largest element is: " + findLargestNumber(array));
	}
	
	// offer the interviewer to sort the array first
	static int findLargestNumber(int[] array){
		
		int largest = array[0];
		int indexOfLargest = 0;
		for (int i = 1; i < array.length; i++) {
			if(largest <= array[i]) {
				// now we are changing the value of the largest if the next index has a greater value
				largest = array[i];
				indexOfLargest = i;
			}
		}
		System.out.println("\nThe index of largest is " + indexOfLargest);
		
		return largest;
	}
}
