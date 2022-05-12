package javaFastTrack3.day3;

// if the object is a apple pie, the class is the recipe of the apple pie
public class MethodIntroduction {
	
	// constructor is a special method that has the same name with the Class name
	// and no return type
	// there are three constructors, we are doing overloading here. 
	public MethodIntroduction() {
	}

	public MethodIntroduction(int number) {
	}
	
	public MethodIntroduction(String str) {
	}

	// default, public, private, protected
	// static methods belong to the class
	// non-static methods belong to the object
	// to be able to use a static method, first use the class name
	// to be able to use a non-static method, create an instance from that class
	public static void main(String[] args) {
		// functions and method is same thing
		// by convention a method should not be more than 50(max) lines of code.
		//method(10);

		// Math is a final class that we can not extend
		Math.addExact(10, 6);

		String str = "hello";
		
		recursiveMethod(0);
		
		// method overloading example 
		MethodIntroduction.sum(10, 6);
		MethodIntroduction.sum(10.5, 6.5);
		
	}

	public static int sum(int number1, int number2) {
		int sum = number1 + number2;
		return sum; 
	}

	public static double sum(double number1, double number2) {
		// return type is not a part of the method signature
		double sum = number1 + number2;
		return sum; 
	}

	public static void method1() {
		System.out.println("Void method does not have a return type");
	}
	
	// if you call the method from the same method, it is called a recursive method
	// and we should use a condition to return back to the main.
	public static void recursiveMethod(int number) {
		
		if(number == 101) {
			return;
		}
		System.out.println(number++);
		
		recursiveMethod(number);
	}
	

}
