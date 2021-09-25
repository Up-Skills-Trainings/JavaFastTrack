package day1;

public class LogicCheck {
	public static void main(String[] args) {
		
		// purpose of this question to understand the logical mistake that you can face during the interview
		int score = 90;
		
		if (score >= 90.0)
			System.out.println("A");
		else if (score >= 80.0)
			System.out.println("B");
		else if (score >= 70.0)
			System.out.println("C");
		else if (score >= 60.0)
			System.out.println("D");
		else
			System.out.println("F");
	}
}
