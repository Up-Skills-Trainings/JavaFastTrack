package course2_day1;

public class StringClassPractice {
	public static void main(String[] args) {
		String str = "hello"; // string is a char array ['h', 'e', 'l', 'l', 'o']

		// What is String in Java? String is a data type?
		// String is the most important class of the Java.
		// It has around 13 constructors and more than 47 methods.
		// It is a final and immutable(not changeable) class.
		// Stringbuilder and Stringbuffer >> mutable classes

		// What are different ways to create String Object?

		String str1 = "hello"; // obj1

		String str2 = new String("hello");

		String str3 = "hello";

		// == >> it points out the memory location
		// equals() >> it point out the value

		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);

		// Common string methods

	}
}
