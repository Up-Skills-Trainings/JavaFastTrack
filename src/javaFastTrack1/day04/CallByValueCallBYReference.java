package javaFastTrack1.day04;

public class CallByValueCallBYReference {
	public static void main(String[] args) {
		int a = 10;

		int[] arr = {5, 10, 43};

		System.out.println(method(a));
		
		method(arr);
		
		for (int each : arr) {
			System.out.print(each + " ");
		}
	}
	
	// primitive types can not be changed, pass by value
	private static int method(int a) {

		a = 20;

		return a;
	}

	// array types can be changed, pass by reference
	private static int[] method(int[] arr) {
		arr[0] = 100;
		return arr;
	}
}
