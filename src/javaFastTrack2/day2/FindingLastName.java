package javaFastTrack2.day2;

public class FindingLastName {
	public static void main(String[] args) {
		// the given input is a full name, and we need to find the last name
		// Pavel Shvetsov
		// Onur Kafali
		String name1 = "Pavel Shvetsov";
		String name2 = "Onur Kafali";
		
		int indexOfWhiteSpace = name1.indexOf(" ") + 1;
		String lastName = name1.substring(indexOfWhiteSpace, name1.length());
		System.out.println(lastName);
		

		
	}
}
