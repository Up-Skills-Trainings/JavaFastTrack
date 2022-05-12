package javaFastTrack3.day3;

public class Day2Review {
	public static void main(String[] args) {
		 /* (Palindromic prime) A palindromic prime is a prime number and also palindro-
		 * mic. For example, 131 is a prime and also a palindromic prime, as are 313 and
		 * 757. Write a program that displays the first 100 palindromic prime numbers.
		 * Dis- play 10 numbers per line, separated by exactly one space, as follows: 2
		 * 3 5 7 11 101 131 151 181 191 313 353 373 383 727 757 787 797 919 929
		 */
		
		int limit = 100;
		
		for (int prime = 2; prime < limit; prime++) {
			Boolean isPrime = true;
			for (int divisor = 2; divisor < prime; divisor++) {
				if (prime % divisor == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(prime + " ");
			}
		}
		
	}
}



























/*
 * Day 3
 * 
 * Review day2
 * 
 * Palindrome
 * 
 * Methods/Procedures/Functions The purpose is to help main Break them into
 * small pieces, manage them, microservices
 * 
 * Passing arguments by values Overloading Methods The scope of variables
 * =============================================
 * 
 * Method has two parts header >> modifier, return type, method name, method
 * parameter (no return type) body define the method call/invoke the method
 * declare the variable By convention, method body 50 lines
 * =============================================
 * 
 * Scope of Variables/Methods with modifiers Methods do not see other method's
 * variables
 * 
 * =============================================
 * 
 * Find the mistake below;
 * 
 * public static int camel(int n) { if (n > 0) return 1; else if (n == 0) return
 * 0; else if (n < 0) return –1; }
 * 
 * =============================================
 * 
 * Writing Simple Method >> addition
 * 
 * addNumbers(1, 30);
 * 
 * =============================================
 * 
 * Passing the arguments
 * 
 * public static void nPrintln(String message, int n) { for (int i = 0; i < n;
 * i++) System.out.println(message); } nPrintln("Hello", 3); nPrintln(3,
 * "Hello"); =============================================
 * 
 * Pass by value example
 * 
 * Increment example: Before the call, x is 1 n inside the method is 2 After the
 * call, x is 1
 * 
 * =============================================
 ** 
 * Test >> Pass By Value, always creates a copy
 * 
 * //Before using the method
 * System.out.println("Before invoking the swap method, num1 is " + num1 +
 * " and num2 is " + num2);
 * 
 * // Invoke the swap method to attempt to swap two variables swap(num1, num2);
 * 
 * System.out.println("After invoking the swap method, num1 is " + num1 +
 * " and num2 is " + num2);
 * 
 * =============================================
 * 
 * void method example
 * 
 * =============================================
 * 
 * Find the GreatCommonDivisor of given two numbers
 * 
 * =============================================
 * 
 * Prime Numbers and Palindromes with method.
 * 
 * =============================================
 * 
 * RECURSIVE METHOD, STACKOVERFLOW ERROR
 * 
 * in the output expections, another thread has been created
 * 
 * =============================================
 * 
 * Method overloading, finding the max with max method.
 * 
 * Overloaded methods must have different parameter lists. You cannot overload
 * methods based on different modifiers or return types.
 * 
 * Return type and access modifier is not part of the method signature
 * 
 * =============================================
 * 
 * 
 * (Check password) Some websites impose certain rules for passwords. Write a
 * method that checks whether a string is a valid password. Suppose the password
 * rules are as follows:
 * 
 * ■ A password must have at least eight characters. ■ A password consists of
 * only letters and digits. ■ A password must contain at least two digits.
 * 
 * Write a program that prompts the user to enter a password and displays Valid
 * Password if the rules are followed or Invalid Password otherwise.
 * 
 * =============================================
 * 
 * (Palindromic prime) A palindromic prime is a prime number and also palindro-
 * mic. For example, 131 is a prime and also a palindromic prime, as are 313 and
 * 757. Write a program that displays the first 100 palindromic prime numbers.
 * Dis- play 10 numbers per line, separated by exactly one space, as follows: 2
 * 3 5 7 11 101 131 151 181 191 313 353 373 383 727 757 787 797 919 929
 * 
 * =============================================
 */
