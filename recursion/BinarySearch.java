import java.util.Arrays;

public class BinarySearch {

    // Returns the index of the element 'n' in the array 'arr'
    // Returns -1 if n is not in the array

    /*
    What is the time complexity of normalSearch()?

    O(n)
    time scales linearly with 'n'
    */
    public static int normalSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            // return i if the value at i in the array is equal to n
            if (arr[i] == n) {
                return i;
            }
        }

        // if we haven't returned anything, then we haven't found n
        return -1;
    }

    // Returns the index of the element 'n' in the SORTED array 'arr'
    // Returns -1 if n is not in the array


    // int[] sortedArr = {-3, 0, 5, 9, 12, 17, 34};
    // System.out.println( binarySearch(sortedArr, -3) );     // 0
    public static String binarySearch(int[] arr, int n) {
        /*
            1. Get a midpoint of the array
            2. Check if that midpoint is < or > n
            3. if <, calculate binarySearch() with the array past the midpoint
               if >, calculate binarySearch() with the array before the midpoint
         */
        // BASE CASE
            if (arr.length == 1) {
                if (arr[0] == n) {
                    return "found it";
                } else {
                    return "couldn't find it";
                }
        } else {
            // index of a midpoint
           int midpoint = arr.length/2;

           if (n < arr[midpoint]) { // calculate binarySearch() with the array before the midpoint
               // spilt array to the first half
               int[] newArray = Arrays.copyOfRange(arr, 0, midpoint); //[-3, 0, 5]
               return binarySearch(newArray, n);

           } else { // calculate binarySearch() with the array past the midpoint
               int [] newArray = Arrays.copyOfRange(arr, midpoint, arr.length);
               return binarySearch(newArray, n);
           }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 67, 33, 2, -1, 0};

//        System.out.println( normalSearch(arr, 2) );     // 0
//        System.out.println( normalSearch(arr, -1) );    // 6
//        System.out.println( normalSearch(arr, 67) );    // 3
//        System.out.println( normalSearch(arr, 1) );     // -1


        int[] sortedArr = {-3, 0, 5, 9, 12, 17, 34};
        System.out.println( binarySearch(sortedArr, -3) );     // 0
        System.out.println( binarySearch(sortedArr, 0) );    // 6
        System.out.println( binarySearch(sortedArr, 435) );    // 3
        System.out.println( binarySearch(sortedArr, -1) );

    }
}

