package javaFastTrack2.day05;

public class StaticExample {

	private int number = 10;
	static int number2 = 20;

	/*
	 * There are two concepts 1- Class (Pie recipe), 2- Object (Pie) Static is most
	 * important keyword in Java.
	 * 
	 * Static separates the procedural programming from functional programming. All
	 * the members of the Java is a static or a non-static. Whatever is static that
	 * belongs to the Class, Whatever is non - static that belongs to the Object.
	 * 
	 * Static members of a class can be accessible using the Class name. But to be
	 * able to access to the non-static members, we have to create an instance from
	 * that class.
	 */

	public static void main(String[] args) {

		StaticMemberAccessing obj = new StaticMemberAccessing();

		// I just accessed the non-static member using the instance.
		obj.m1();

		StaticMemberAccessing.m2();

		// Math class is a great example for the static.
		Math.abs(10);
		
	}
}
