package javaFastTrack2.day03;

public class LogicCheck {
	public static void main(String[] args) {
		// example for an ambiguous method.
		// compiler does not know which method it will call.
		// sum(10, 20);
	}

	public static int camel(int n) {
		if (n > 0)
			return 1;
		else if (n == 0)
			return 0;
		else
			return -1;

	}

	static int sum(int a, double b) {
		return a + (int) b;
	}

	static int sum(double a, int b) {
		return (int) a + b;
	}
}
