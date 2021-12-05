package javaFastTrack2.day03;

public class OverloadingMethod {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		sum(a, b);
	}
	
	static int sum(int a, int b) {
		return a + b;
	}
	
	static double sum(double a, int b) {
		return a + b;
	}
}
