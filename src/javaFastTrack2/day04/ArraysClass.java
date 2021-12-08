package javaFastTrack2.day04;

public class ArraysClass {
	public static void main(String[] args) {
		// array >> it stores the data in it. 
		// it is an object type in java
		
		// I wanna create a primitive type
		int a;
		
		// if you just type int[] referanceName, you are only creating the referance
		// not the actual object
		// to learn how many objects we have created, we count the "new" keywords
		int[] array1;
		
		int[] array2 = new int[10];
		
		int[] array3 = new int[10];
		
		int[] array4 = new int[3];
		
		int[] array5 = new int[3];
		
		// assign the value, by default, their values are always 0 for int, 
		array5[0] = 10;
		array5[1] = 20;
		array5[2] = 30;
		
		// if you do the operation below, you will lose the array4. 
		array4 = array5;
		
		// copying arrays
		for (int i = 0; i < array5.length; i++) {
			array4[i] = array5[i];
		}
		
		// printing arrays
		System.out.println(array5); // this returns the hashcode
		
		for (int i = 0; i < array5.length; i++) {
			System.out.println(array5[i]);
		}
		
		// foreach loops
		for (int each : array5) {
			System.out.println(each);
		}
	}
}
