package course2_day1;

public class LogicTest {
	/*
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

	public static void main(String s[]) {

		if (1 < 2) {

			System.out.println("1 is less than 2");
		} else {
			System.out.println("2 is less than 1");
		}
		System.out.println("Hello From IfExample");

		// Curly brace is important to determine the scope of the variable

		for (int i = 0; i < s.length; i++) {
			i = 10;
			int b = 0;
		}
		// scope of variable, b should not be here.
		// b = 10;
//================================================================================
		
		// check the logic error below
		int score = 90;
		
		if (score >= 60.0)
			System.out.println("D");
		else if (score >= 70.0)
			System.out.println("C");
		else if (score >= 80.0)
			System.out.println("B");
		else if (score >= 90.0)
			System.out.println("A");
		else
			System.out.println("F");
	}

}
