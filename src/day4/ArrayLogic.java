package day4;

public class ArrayLogic {
	public static void main(String[] args) {
		// what is array
		// array is an object
		// and it stores data in it.

		int number1 = 5;
		int number2 = 10;
		int number3 = 15;
		int number4 = 20;
		int number5 = 25;
		int number6 = 30;

		// new is the keyword, you will be using this whenever you create an object
		// I need the type of the array (int, double, char, boolean) we have to specify
		// specify the length of the array when you create it.
		int[] array1 = new int[10];

		// if we are not giving the length of the array, then we can use the statement
		// below.
		int[] array2 = { 1, 2, 3, 4 };

		// if we just do this int[] array3; , we are creating a reference of the array
		// in the stack memory
		// but there is no array yet.
		// whenever we use the "new" keyword, then we are creating the actual
		// object/array in the
		// heap memory
		int[] array3;
		array3 = new int[5];

		// when we create a varibale, int a; there is no initial value
		// but arrays have initial value
		int a;
		a = 10;
		
		// for int the initial value is 0, for boolean it is false
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
		
		boolean[] bool = new boolean[5];
		for (int i = 0; i < bool.length; i++) {
			System.out.print(bool[i] + " ");
		}
		// string is an char array, we can create a string without using new keyword
		// but it is only special to the String class in the Java
		String str = new String("Hello");

	}
}