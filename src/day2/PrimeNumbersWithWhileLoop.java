package day2;

public class PrimeNumbersWithWhileLoop {
	public static void main(String[] args) {
		
		
		int numberOfPrimes = 10; // we want to find first 50 prime numbers
		int count = 0; // it will increase if a number is prime
		int number = 2; // a number to be tested for the primeness
		boolean isPrime = true;
		while (count < numberOfPrimes) {
			//boolean isPrime = true; // we have to keep it here, 
			for (int divisor = 2; divisor < number; divisor++) {
				if (number % divisor == 0) { // if the result is not ZERO, it is not prime
					isPrime = false; // boolean statement will be false
					break; // break the loop
				}
			}

			if (isPrime) { // after the inner loop, if isPrime is still true, 
							//print out the number and increase the count
				System.out.print(number + " ");
				count++;
			}
			// incerase the number to be able to test the next number's primeness
			number++;
		}
	}
}
