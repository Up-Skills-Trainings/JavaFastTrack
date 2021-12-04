package day2;

public class FinraGame {
	public static void main(String[] args) {
		/*
		 * Write a function which prints out the numbers from 1 to 30 but for numbers
		 * which are a multiple of 3, print "FIN" instead of the number and for numbers
		 * which are a multiple of 5, print "RA" instead of the number. for numbers
		 * which are a multiple of both 3 and 5, print "FINRA" instead of the number.
		 */

		for (int i = 1; i <= 30; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("FINRA ");
			} else if (i % 3 == 0) {
				System.out.print("FIN ");
			} else if (i % 5 == 0) {
				System.out.print("RA ");
			} else {
				System.out.print(i + " ");
			}

		}
	}
}
