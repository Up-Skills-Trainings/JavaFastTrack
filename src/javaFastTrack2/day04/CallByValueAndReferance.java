package javaFastTrack2.day04;

public class CallByValueAndReferance {

	public static void main(String[] args) {

//		// creating a primitive type 
		int a = 10;
		System.out.println("Before invoking the increase method, the value of a: " + a);
		increase(a);
		System.out.println("After invoking the increase method, the value of a: " + a);
		
		System.out.println("=================================");
		
		// creating an array 
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		// printing the array before invoke the increase method
		System.out.println("Before calling the increase method for array");
		printArray(array);
		increase(array);
		// printing the array after invoke the increase method
		System.out.println("\nAfter calling the increase method for array");
		printArray(array);
	}

	// this method gets the primitive type and increases the value of it. 
	// pass by value
	public static void increase(int a) {
		a = 20;
		System.out.println("Inside of the increase method, the value of a: " + a);
	}

	// this method changes the value of an array
	// pass by referance
	public static void increase(int[] array) {
		array[3] = 20;
	}

	// this method prints the array
	public static void printArray(int[] array) {
		for (int each : array) {
			System.out.print(each + " ");
		}
	}

}