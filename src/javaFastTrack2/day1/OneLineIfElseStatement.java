package course2_day1;

public class OneLineIfElseStatement {

	public static void main(String[] args) {
		int applePrice = 5;
		int orangePrice = 10;

		System.out.println(applePrice > orangePrice ? "Apple wins" : "Orange wins");

		// ===================================
		// What will be the output of the following program?
		boolean a, b, c;
		a = b = c = true;

		if (!a || (b && c)) {
			System.out.println("If statement executed");
		} else {
			System.out.println("else statement executed");
		}
	}
}
