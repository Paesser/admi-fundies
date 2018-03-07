/*
Array Utility Classes
*/
public class ArrayUtils {

	// Write a method contains() that takes in an int array and an int value
	// and returns true if the int is contained in the array
	public static boolean contains(int[] arr, int x) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return true;
			}
		}
		return false;
	}

	// Returns the first occuring index of the integer given in the array
	// If the integer does not occur in the array, return the length of the array
	public static int indexOf(int[] arr, int x) {

	}

	public static void main(String[] args) {
		int[] testArray = {2, 273, 2, 15, 45, 43, 388, 3};
		int x = 15;

		System.out.println("is " + x + " in the array?" + contains(testArray, x));
		System.out.println("The index of " + x + " in the array is " + indexOf(testArray, x));
	}
}