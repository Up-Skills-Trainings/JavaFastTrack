package javaFastTrack3.day5;

public class ChildStaticClass extends StaticClass {

	public static void main(String[] args) {
		StaticClass obj = new StaticClass();

		double num = obj.number1;

		// this a wrong usage, access anything static with a static way.
		double num1 = obj.number;
		// Using the class name is a static way reaching out the static members.
		double num2 = StaticClass.number;

		// if you are using the reference, we can access everything including static
		// members
		// but if we are using a class name, we can only access to the static members.
		// to be able to access any non-static members, create an instance from that
		// class.
		// STAR method to answer any interview question
		StaticClass.method();

		// create an instance from the class if you want to use the non-static members
		// method1();

	}

	void method1() {
		System.out.println("This is a non static method from the ChildOOP class");
	}
}
