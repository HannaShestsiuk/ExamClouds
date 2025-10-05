/**
 * Merge Two Arrays
 * int[] arr1 = {1, 3, 5};
 * int[] arr2 = {2, 4, 6};
 */
package array;

import java.util.Arrays;

public class II_MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        int arrayLength1 = array1.length;
        int arrayLength2 = array2.length;

        int mergedArrayLength = arrayLength1 + arrayLength2;
        int[] mergedArray = new int[mergedArrayLength];

        System.arraycopy(array1, 0, mergedArray, 0, arrayLength1);
        System.arraycopy(array2, 0, mergedArray, arrayLength1, arrayLength2);

        System.out.println(Arrays.toString(mergedArray));
    }
}