package javaFastTrack2.day03;

public class Methods {
	public static void main(String[] args) {
		recursive(0);
		
	}

	// return type is not a method signature
	// method name and parameter is the method signature
	static int method(int numb) {
		return 0;
	}

	// void method does not have a return type
	static void method1(int numb) {
		return;
	}

	// recursive methods
	// if you call a method from the same method, it's called recursive method
	// we have a put a condition to exit from the method using the "return"
	static void recursive(int a) {

		if (a == 100) {
			return;
		}
		System.out.println(a++);
		recursive(a);
	}
}
