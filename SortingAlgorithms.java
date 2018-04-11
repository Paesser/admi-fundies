import java.util.Arrays;
public class SortingAlgorithms {

    /*
        This method sorts an array in ascending order
        i.e.

        [3, 7, 2, 1] -> [1, 2, 3, 7]
        [1, 1, 1, 0, 2] -> [0, 1, 1, 1, 2]

        For now, efficiency doesn't matter.
     */

    public static void dumbSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j > 0; j--) {
                if (arr[j-1] > arr[j]) {

                    // Swap them
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String [] args) {
        int[] arrayToSort = {34, 5, 6,2, 1, 4, 6,};
        dumbSort(arrayToSort);

        System.out.print(Arrays.toString(arrayToSort));
    }
}
