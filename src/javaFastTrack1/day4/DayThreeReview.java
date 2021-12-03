package day4;

//we can create a variable inside of the class and outside of the any method
public class DayThreeReview {
	int number = 100;
	// we can create a variable in any method
	public static void main(String[] args) {
		// time streaming happens from the main method
		
		int a = 10;
		int b = 20;
		add(a, b);
		
		System.out.println("The value of a and b outside of the add method: " + a + " " + b);
		
		// we can create a varible in the for loop header
		for (int i = 0; i < args.length; i++) {
			
		}
	}

	// we can create a variable using the method header
	private static void add(int a, int b) {
		a = 20;
		b = 40;
		System.out.println("The value of a and b inside of the add method: " + a + " " + b);

	}
}
