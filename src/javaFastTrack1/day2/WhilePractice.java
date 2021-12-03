package day2;

public class WhilePractice {
	public static void main(String[] args) {

		int num = 0;

		while (num < 20) {
			System.out.println("hello ");
			num++;
		}

		/*
		 * int sum = 0, i = 1; while (i < 10) { sum = sum + i; }
		 */
		
		int sum = 0; 
		int i = 1;
		while(i < 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
