package javaFastTrack3.day1;

public class LogicErrors {
	public static void main(String[] args) {
		// Q4: What is wrong in the following code?
		double score = 90.0;
		
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
