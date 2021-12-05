package javaFastTrack2.day03;

public class PassByValueSwapping {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before invoking swapping method: a: " + a + " b: " + b);
		swapping(a, b);
		System.out.println("After invoking swapping method: a: " + a + " b: " + b);
	}

	private static void swapping(int a, int b) {
		
		// to be able to achive swapping, we need to create a temp value. 
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("During the swapping method: a: " + a + " b: " + b);
	}
}
