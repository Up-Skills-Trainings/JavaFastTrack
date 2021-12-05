package javaFastTrack1.day03;

public class FirstMethod {

	// main method is the starting point of the program
	public static void main(String[] args) {
		// we will define the method when we create it
		// we will declare the variable when we create it
	}

	// the new method comes here outside of the curly brace of the main method
	// the purpose of the using the methods is to help the main method
	// and to organize and maintain the code.
	// by convention, a method has no more than 50 lines

	// non-void method has a return type and it has to return something
	// the return has to have the same type from the method signature
	// return is not part of the signature
	// the method signature has return type, name, and argument type, and number of
	// args.
	public static int newMethod(int a) {
		// that's the method body
		return 1;
	}

	// void is the method that does not have a return type, and it does not have to
	// return anything.
	public static void methodVoidWithoutReturn(int a, int b) {
		// that's the method body

	}

	// but we can still use the return in the void method, if we have some sort of
	// conditions
	// it does not return anything, it just stops executing the method and goes back
	// to where it came from.
	public static void methodVoidWithReturn(int a, int b) {
		if (a > b) {
			return;
		}
	}
}
