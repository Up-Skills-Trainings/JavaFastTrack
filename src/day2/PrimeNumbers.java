package day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		// want to see prime numbers till 
		int count = 100;
		int number = 2;
		
		for (int prime = 2; prime < count; prime++) {
			
			boolean isPrime = true;	
			
			for (int divisor = 2; divisor < prime; divisor++) {
			
				if(prime % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.print(prime + " ");
			}
			
		}
		
		
	}

}
