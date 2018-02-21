import java.util.Arrays;
class MethodsPractice {
	
	// Write a method sumOfArray that takes in an argument of type int[]
	// and calculates the sum of all values in the array (using a for loop)
	// and returns that value as a sum
	public static int sumOfArray(int[] arrayToSum) {
		// initialize a variable called sum to 0
		int sum = 0;
		
		for(int i = 0; i < arrayToSum.length; i++) {
			sum = sum + arrayToSum[i];
		}
		return sum;
	}

	// This will get the sum of the array (using arrayToSum)
	// and after, divide by the length to return the average
	public static double average(int[] arrayToAverage) {
		int sum = sumOfArray(arrayToAverage);
		int length = arrayToAverage.length;
		return sum/length;
	}

	public static String getBiggerArraySum(int[] firstArray, int[] secondArray) {
		int sumOfFirstArray = sumOfArray(firstArray);
		int sumOfSecondArray = sumOfArray(secondArray);

		if(sumOfFirstArray > sumOfSecondArray) {
			return "First Array is Bigger";
		} else {
			return "Second Array is Bigger";
		}
	}


	public static void main(String[] args) {
		int[] x = {1, 2, 3, 4, 5};
		int[] y = {2, 3, -4, -5, -6, -7, -8, -9};
		
		//int average = average(x);
		String biggerArray = getBiggerArraySum(x, y);
		System.out.println(biggerArray);
	}
}

