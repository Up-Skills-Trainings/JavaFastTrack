package javaFastTrack1.day01;

import java.util.Scanner;

public class StringClassMethods {
	public static void main(String[] args) {
		String str = "HELLO world";
		String str1 = " from CYDEO";
		// length of the string 
		int len = str.length();
		
		// getting specific char from the string
		char ch = str.charAt(1);
		
		// concatenating strings
		String str2 = str + str1;
		System.out.println(str2);
		
		// lowercase and uppercase
		str2 = str2.toLowerCase();
		System.out.println(str2);
		str2 = str2.toUpperCase();
		System.out.println(str2);
		
		// getting a string input from the user
		Scanner input = new Scanner(System.in);
		String str3 = input.nextLine();
		
		// obtaining substrings >> message.substring(beginIncluded, endsNOTincluded);
		// user gives a time which is 11:30am
		// my purpose is to get just the hour from that time
		int len1 = str3.length();
		String hours = str3.substring(5, len1);
		System.out.println(hours);
		
	}
}
