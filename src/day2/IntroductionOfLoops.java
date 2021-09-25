package day2;

public class IntroductionOfLoops {
	public static void main(String[] args) {

		// for loops
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

		// while loops
		int a = 0;
		while (a < 10) {
			System.out.println(a);
			a++;
		}
		int b = 0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			b++;
		}
		System.out.println(b);

	}
}
