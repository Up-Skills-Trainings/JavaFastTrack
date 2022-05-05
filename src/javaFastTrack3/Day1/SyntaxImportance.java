package javaFastTrack3.Day1;

public class SyntaxImportance {
	public static void main(String[] args) {

		/*
		 * Q3: Importance of using proper syntax
		 * 
		 * What will be the output of the following program?
		 * 
		 * class IfExample{
		 * 
		 * public static void main(String s[]){
		 * 
		 * if( 1 < 2 ){
		 * 
		 * System.out.println("1 is less than 2"); } else
		 * System.out.println("2 is less than 1");
		 * System.out.println("Hello From IfExample");
		 * 
		 * } }
		 */

		if (1 < 2) {
			System.out.println("1 is less than 2");
		} else {
			System.out.println("2 is less than 1");
			System.out.println("Hello From IfExample");
		}
	}
}
