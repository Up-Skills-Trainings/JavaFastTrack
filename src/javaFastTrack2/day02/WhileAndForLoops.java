package javaFastTrack2.day02;

public class WhileAndForLoops {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

		int count = 0;
		while (count <= 99) {
			System.out.println("Welcome to Java!");
			count++;
		}

		// find the sum of the first 10 integers
		int sum = 0;
		int i = 1;

		while (i < 10) {
			sum = sum + i;
			i += 1; // i++;
		}
		System.out.println(sum);

	}
}
