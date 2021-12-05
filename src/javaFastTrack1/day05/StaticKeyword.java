package javaFastTrack1.day05;

public class StaticKeyword {

	static int staticNumber = 5;
	int nonStaticNumber1 = 5;

	// everything happens here without creating an object is called functional
	// programming
	// in another word, when we use static we do functional programming

	// Answer
	// static is the most important keyword in Java
	// everything till OOP happens with the static members
	// when we work with OOP, we work with objects (non-static members)
	// static separates the functional programming from the procedural programming
	// we have two things in Java
	// 1 - static member > anything that belongs to Class
	// 2 - non-static members; >> anything that belongs to Object
	// you can use the example from your automation framework
	// you can use the Math class as an example

	static void method() {
		System.out.println("This is a static method");
	}

	void method1() {
		System.out.println("This is not a static method");
	}

}
