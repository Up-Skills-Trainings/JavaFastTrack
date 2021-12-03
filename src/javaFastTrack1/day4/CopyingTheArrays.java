package day4;

public class CopyingTheArrays {
	public static void main(String[] args) {
		// here I am gonna create two arrays
		// and I am going to make a copy of them
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6};
		
		// ? what will happen if I copy the array 
		// arr1 will go to the trash can, no more arr1 object 
		// you are gonna still have the ref arry1, but it will show the arr2's object
		// we are telling the arr1 "show the arr2 object after that"
		arr1 = arr2;
		
		// if I want to make a hard copy of the arr2, 
		// I need to reach out the index of the arr2 and arr1
		// if you want to make any array manipulation, we have to create a foor loop
		for (int i = 0; i < arr2.length; i++) {
			//arr2[i] >> it return an integer, number 
			arr1[i] = arr2[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("array1: " + arr1[i] + "\narray2: " + arr2[i]);
		}
		
	}
}
