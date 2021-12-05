package javaFastTrack1.day06;


/* String >> Immutable, Slow
 * 
 * Stringbuffer >>  Mutable, Faster
 * Stringbuilder >> Mutable, Much Faster
 * 
 * */



public class TestStringSpeed {

	public static void main(String[] args) {

		int n = 150000;

		// empty string, the purpose of that is to append the string in the for loop
		String s = "";
		
		// This is an epoch time, Jan 1st 1970
		// it will return the current milliseccond
		long startingTime = System.currentTimeMillis();
		
		for (int i = 0; i < n; i++) {
			s += "a";
		}
		// it will return the current milliseccond
		long endingTime = System.currentTimeMillis();

		long dif = endingTime - startingTime;
		
		System.out.println(dif + " millisecond.");

		System.out.println("==========================");

		// String buffer is faster
		StringBuffer sb = new StringBuffer("");
		
		// it will return the current milliseccond
		startingTime = System.currentTimeMillis();
		
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		
		endingTime = System.currentTimeMillis();
		
		long dif1 = endingTime - startingTime;
		
		System.out.println(dif1 + " millisecond.");

		System.out.println("==========================");

		
		// Builder is the fastest
		StringBuilder sBuilder = new StringBuilder("");
		
		// it will return the current milliseccond
		startingTime = System.currentTimeMillis();
		
		for (int i = 0; i < n; i++) {
			sBuilder.append("a");
		}
		
		endingTime = System.currentTimeMillis();
		
		long dif2 = endingTime - startingTime;
		
		System.out.println(dif2 + " millisecond.");
		
		
	}

}
