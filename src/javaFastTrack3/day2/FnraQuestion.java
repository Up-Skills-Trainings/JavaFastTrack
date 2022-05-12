package javaFastTrack3.day2;

public class FnraQuestion {
	public static void main(String[] args) {
		/*
		 * /* Write a function which prints out the numbers from 1 to 30 but for numbers
		 * which are a multiple of 3, print "FIN" instead of the number and for numbers
		 * which are a multiple of 5, print "RA" instead of the number. for numbers
		 * which are a multiple of both 3 and 5, print "FINRA" instead of the number.
		 */
		
		int number = 30;
		for (int i = 1; i <= number; i++) {
			// if the reminder is zero, that means, it can be divisible by three
			// start with the most unique scenario
			if(i % 15 == 0) {
				System.out.print("FINRA ");
			}else if (i % 5 == 0) {
				System.out.print("RA ");
			}else if(i % 3 == 0) {
				System.out.print("FIN ");
			}else {
				System.out.print(i + " ");
			}
			
		}
	}
}
