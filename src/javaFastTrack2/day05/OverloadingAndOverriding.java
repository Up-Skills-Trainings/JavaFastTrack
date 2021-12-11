package javaFastTrack2.day05;

public class OverloadingAndOverriding {
	public static void main(String[] args) {
		method(10);
		method(10.5);
		
		// Check the SuperClass and SubClass for overriding example
		SuperClass superClass = new SuperClass();
		
		superClass.method();
		
	}

	static void method(double d) {
		// TODO Auto-generated method stub
		
	}

	static void method(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
