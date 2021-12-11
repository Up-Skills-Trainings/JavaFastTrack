package javaFastTrack2.day05;

public class SubClass extends SuperClass {
	// we can not override the static methods.
	// when you override something, you can cannot reduce the visibility
	// same name same parameter
	public void method() {
		System.out.println("This is a sub class method");
	}
}
