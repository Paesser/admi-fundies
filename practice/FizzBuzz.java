/**
Write a program that prints the numbers from 1 to 100. 
But for multiples of three print “Fizz” instead of the number and 
for the multiples of five print “Buzz”. 
For numbers which are multiples of both three and five print “FizzBuzz”."

1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...

*/

public class FizzBuzz {
	// returns "true" if a number is divisible by 3, false otherwise
	public static boolean divisibleBy3(int x) {
		return x % 3 == 0;
	}

	// returns "true" if a number is divisible by 5, false otherwise
	public static boolean divisibleBy5(int x) {
		return x % 5 == 0;
	}
	public static void main(String[] args) {
		int end = 100;

		for (int i = 1; i <= 100; i++) {
	         
	         // Print "FizzBuzz" if number is divisible by 3 & 5
	         if (divisibleBy3(i) && divisibleBy5(i)) {
	            System.out.println("FizzBuzz");
	         }
	         
	         // Print "Fizz" if number is divisible by 3
	         else if (divisibleBy3(i)) {
	            System.out.println("Fizz");
	         }

	         // Print "Buzz" if the number is divisible by 5
	         else if (divisibleBy5(i)) {
	            System.out.println("Buzz");

	         // If neither, print the number out
	         
	         } else {
	            System.out.println(i);
	         }
      }
	}
}