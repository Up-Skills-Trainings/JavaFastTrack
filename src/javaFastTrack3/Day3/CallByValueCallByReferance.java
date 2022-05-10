package javaFastTrack3.Day3;

public class CallByValueCallByReferance {
	public static void main(String[] args) {
		
		int[] arr = { 5, 10, 15 };

		int number = 10;
		
		System.out.println("The value before the method: " + number);
	
		changeTheValue(number);
		
		System.out.println("The value after the method: " + number);
		
		System.out.println("==================================================");
		
		System.out.println("The value before the method: " + arr[0]);
		
		changeTheValue(arr);
		
		System.out.println("The value before the method: " + arr[0]);
	}

	// this is called call by VALUE, methods do not know the other methods variables. 
	private static void changeTheValue(int number) {
		number = 1000;
	}
	
	// once you sent a reference to method, if you change the value, you are actually changing the value of that object 
	private static void changeTheValue(int[] arr) {
		arr[0] = 100;	
	}
}
