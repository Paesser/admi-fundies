/*
Write a program called CheckOddEven which prints 
"Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.

Hints: n is an even number if (n % 2) is 0; otherwise, it is an odd number.
*/
public class CheckOddEven {


   public static boolean isOdd(int number) {
      // if (number % 2 == 0) {
      //    return false;
      // } else {
      //    return true;
      // }
      return number % 2 != 0;
   }

   public static void main(String[] args) {  // Program entry point
      
      int number = 50;       // Set the value of "number" here!
      
      System.out.println("The number is " + number);
      

      if (!isOdd(number)) { // this number is even
         System.out.println("Even Number");
      } else {
         System.out.println("Odd Number");
      }
   }
}

/*
 Write a boolean method called isOdd() 
 which takes an int as input and returns true if the it is odd. 
 The signature of the method is as follows:


public static boolean isOdd(int number)


Use it to re-write CheckOddEven above
*/


/**
The number is 50
EVEN Number
**/