package javaFastTrack1.day01;

public class StringClassPractice {
	public static void main(String[] args) {
		// string is just a char array
		// string is the most important class of Java
		// you do not need to import it, it comes by default with the lang package
		// string has around 13 constructors, and more than 47 methods
		// string class is an immutable class >> it cannot be changed

		// there are two ways creating a string object
		// if we use new keyword, it will create a new object in the memory even if the
		// the object has been created before
		// but if I do not use the new keyword and create the same object like "hello"
		// below, it will not create the new object in the memory
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		String str5 = "hello";

		// the difference between the == and equals() in Java
		// == checks the memory id
		if(str1 == str2) {
			System.out.println("str1 and str2 are equal based on ==");
		}else {
			System.out.println("str1 and str2 are NOT equal based on ==");
		}
		System.out.println("=================================");
		if(str1 == str3) {
			System.out.println("str1 and str3 are equal based on ==");
		}else {
			System.out.println("str1 and str3 are NOT equal based on ==");
		}
		
		// equals() method checks the value of the string
		if(str3.equals(str4)) {
			System.out.println("str3 and str4 are equal based on equals() method");
		}else {
			System.out.println("str3 and str4 are NOT equal based on equals() method");
		}
		
		if(str2.equals(str1)) {
			System.out.println("str1 and str2 are equal based on equals() method");
		}else {
			System.out.println("str1 and str2 are NOT equal based on equals() method");
		}
	}
}
