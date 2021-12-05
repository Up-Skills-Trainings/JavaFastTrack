package javaFastTrack1.day03;

// my purpose here is to print the prime numbers that's been written in different class
public class CallingTheMethodFromAnotherClass {
	public static void main(String[] args) {
		// I want to get prime numbers till 50;
		// if we write the class name and put a dot, then we are going to see the STATIC members
		// of that class
		PrimeNumbersWithMethods.primeNumbers(50);
	}
}
