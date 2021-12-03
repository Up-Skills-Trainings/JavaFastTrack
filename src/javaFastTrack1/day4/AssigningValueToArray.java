package day4;

//epoch time, it is the time, it return the milliseconds from January 1st, 1970
//System.out.println(System.currentTimeMillis());
public class AssigningValueToArray {
	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			// random() method will create a number between the 0 and 1, it will be a double
			// value
			// and we need to do casting here.
			// it will return a number between 0 and 100
			arr[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// let's find the sum of the values of the array
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("The sum is: " + sum);

		// let's find the largest element of the array
		// if you want to get the first largest, use this "<",
		// if you want to get the last largest, use this "<=",
		int[] arr2 = { 1, 7, 3, 7, 6, 9, 8, 9, 8, 6 };
		
		// int type of each element of arry2
		for (int each : arr2) {
			System.out.print(each + " ");
		}
		
		System.out.println();
		int largestElement = arr[0];
		int largestElementsIndex = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (largestElement <= arr2[i]) {
				largestElement = arr2[i];
				largestElementsIndex = i;
			}
		}
		System.out.println("The latest largest element is: " + largestElement);
		System.out.println("The last index of the largest element: " + largestElementsIndex);
	}
}
