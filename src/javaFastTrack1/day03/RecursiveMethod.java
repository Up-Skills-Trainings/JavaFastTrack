package javaFastTrack1.day03;

public class RecursiveMethod {
	public static void main(String[] args) {

		method(0);
	}
	
	// this is a recursive method, in the recursive method, you need use a return statement
	// to not to get an error
	static void method(int a) {
		if(a == 100) {
			return;
		}
		System.out.println(a++);
		method(a);
	}
}
