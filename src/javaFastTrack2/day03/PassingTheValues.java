package javaFastTrack2.day03;

public class PassingTheValues {
	public static void main(String[] args) {
		// overloading example
		nPrintln("Hello", 3);
		nPrintln(3, "Hello");
		
	}

	public static void nPrintln(String message, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(message);
		}
	}
	
	public static void nPrintln(int n, String message) {
		for (int i = 0; i < n; i++) {
			System.out.println(message);
		}
	}

}
