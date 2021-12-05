package javaFastTrack2.day2;

public class StringPractice {
	public static void main(String[] args) {
		System.out.println("hello");

		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);

		// String methods

		String str1 = "Hello Cydeo 1";
		String str2 = "Hello Cydeo 2";

		// length()
		int len = str1.length();
		System.out.println(len);

		// charAt(integer), it returns the desired index of the string
		System.out.println(str1.charAt(str1.length() - 1));

		// adding the strings
		System.out.println(str1 + " " + str2);
		
		// if I want to convert an integer to a string 
		int number1 = 100;
		String str3 = "" + number1;
		System.out.println(str3);
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		// str1.substring(beginIncluded, endsNOTincluded);
		// putting just an integer value is not a very good practice during the coding challenges
		String str4 = str1.substring(0, 5);
		System.out.println(str4);

	}
}
