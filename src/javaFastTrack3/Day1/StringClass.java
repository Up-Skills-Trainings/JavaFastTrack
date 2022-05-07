package javaFastTrack3.Day1;

public class StringClass {
	public static void main(String[] args) {
		// String is a special class in Java, it is an object, it is also a char array
		// String is an immutable class
		// Immutable means >> once you created an immutable object, you can not change it.
		
		String str = "hello";
		System.out.println(str.hashCode());
		str = "hola";
		System.out.println(str.hashCode());
	}
}
