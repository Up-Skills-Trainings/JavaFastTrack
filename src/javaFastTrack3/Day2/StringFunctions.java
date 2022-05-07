package javaFastTrack3.Day2;

import java.util.Arrays;
import java.util.Collections;

public class StringFunctions {
	public static void main(String[] args) {
		
		// charAt(), replace(), indexOf(), substring(), 
		// toUpperCase, toLowerCase(), ***split()***
		// interview question, change the plus with "+", and minus word with "-"
		String str = "plusminusplusminusplusminus";
		
		// it returns the char of the giving index
		char ch = str.charAt(1);
		System.out.println(ch);
		
		//replace the word or char from a given string
		String str2 = str.replace("plus", "+");
		str2 = str2.replace("minus", "-");
		System.out.println(str2);
		
		//Given a time, return only the hours
		// 11:00, 9:0, 15:00
		String str3 = "   11:00    ";
		// trim method cuts the whitespaces from begn of the string and end of the string 
		str3 = str3.trim();
		// if it does not find index of given char, it returns -1
		int indexOfChar = str3.indexOf(":");
		String str4 = str3.substring(0, indexOfChar);
		System.out.println("The hour is: " + str4);
		
		// given a name, please return only last name
		// Johnny EightKnight, Mary Light
		String str5 = "Johnny EightKnight";
		int indexOfWhiteSpace = str5.indexOf(" ");
		String onlyLastName = str5.substring(indexOfWhiteSpace + 1, str5.length());
		System.out.println(onlyLastName);
		
		//str = "plusminusplusminusplusminUS";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		// Interview Question, sort the string, and make the first word start with uppercase letter.
		// This is a string. >> A is string this.
		
		// split method
		String str6 = "This is a string";
		String[] strArray = str6.split(" "); // [This, is, a, string]
		System.out.println("========================");
		// join()
		System.out.println(String.join("*", "This", "is", "a", "string"));
		
		// What is Collections
		// What is Collection
	}
}
