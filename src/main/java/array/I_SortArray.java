/**
 * Sort a given Array without built features (Arrays.sort)
 * int[] arr = {5, 2, 8, 1, 3};
 */

package array;

import java.util.Arrays;

public class I_SortArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        int arrLength = array.length;

        for (int i = 0; i < arrLength - 1; i++){
            //compare elements within the unsorted portion of the array;
            for (int j = 0; j < arrLength - 1 - i; j++){
                if(array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // print sorted array
        for (int i = 0; i < arrLength; ++i)
            System.out.print(array[i] + " ");
    }
}