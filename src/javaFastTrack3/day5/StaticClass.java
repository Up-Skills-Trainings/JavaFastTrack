package javaFastTrack3.day5;

public class StaticClass {
// till Object Oriented Programming we are working with functional programming.(array, primitive types, methods, etc...)
// After the OOP, we are working with procedural programming. We are making the framework much easier to maintain with using OOP.
// Great OOP structure makes the Java special.
// keyword is STATIC, after we stop using static keyword, we start to work on OOP. 

	/*
	 * What is static? STATIC is the most important keyword in Java. if anything is
	 * static that means, that member belongs to that class. if anything is
	 * non-static that means, that member belongs to the object. we can have a
	 * static variable, static method, static blocks. once we do something "static"
	 * that means it is going to be same in every part of the project and by
	 * convention, if you are making something static, make it "final". financial
	 * framework, value of the dollar or tax value must be final static. avoid using
	 * avoid using static keyword if you are working with an object.
	 * 
	 * We have some classes with static purpose like a Math class. Every member is a static, and we use class name to reach them out.  
	 */

	//this part is called DATA FIELD, in general, it locates between the class name's block and constructor. 
	static double number = 3.14;

	double number1 = 3.14;

	public StaticClass() {

	}

	static void method() {
		System.out.println("This is a static method");
	}

	// this belongs to the OBJECT, that means, I have to create an instance to be able to use it. 
	void method1() {
		System.out.println("This is a non-static method");
	}

	public static void main(String[] args) {

	}

}
