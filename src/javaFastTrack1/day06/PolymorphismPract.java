package javaFastTrack1.day06;

// If you show a class with its super type, it is called Polymorphism
public class PolymorphismPract extends AbstractPractice {
	
	public static void main(String[] args) {

		Object str = new String("Hello");

	}

	void method2() {

	}
	
	void method() {

	}

	// This is a overridden method,
	// during the inheritence relationship, when we create two methods with the same
	// name,
	// it is called overriding
	// I have to keep the visibility same or more
	// static methods can not be overridden
	// return type must be same or co-variant
	public void print() {
		System.out.println("This is from Polymorphism practice class");
	}
}
