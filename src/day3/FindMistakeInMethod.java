package day3;

public class FindMistakeInMethod {

	public static void main(String[] args) {

	}

	// Find the mistake below;
	// compiler does not know math, we have to be specific with the conditions, or
	// if any of those conditions below does not met, we have to write an "else"
	// statement.
	public static int camel(int n) {
		if (n > 0)
			return 1;
		else if (n == 0)
			return 0;
		else
			return -1;

		// that's the wrong one
		/*
		 * public static int camel(int n) { 
		 * if (n > 0) 
		 * return 1; 
		 * else if (n == 0) 
		 * return 0; 
		 * else if (n < 0) 
		 * return –1; 
		 * }
		 */

	}
}
