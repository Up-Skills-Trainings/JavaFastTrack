package javaFastTrack2.day03;

public class PassByValue {
	public static void main(String[] args) {
		
		int a = 10;

		System.out.println("Before invoking the increase method, the value of a: " + a);

		// it is copying the value of a, and send it to the method
		increase(a);

		System.out.println("After invoking the increase method, the value of a: " + a);
	}

	// when you pass the primitive type argument, it makes a copy of it inside of the method. 
	public static void increase(int a) {

		a = 20;

		System.out.println("Inside of the increase method, the value of a: " + a);

	}
}
