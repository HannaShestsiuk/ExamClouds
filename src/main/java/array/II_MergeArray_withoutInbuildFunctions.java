/**
 * Merge Two Arrays
 * int[] arr1 = {1, 3, 5};
 * int[] arr2 = {2, 4, 6};
 */

// this is an implementation of array merge without inbuild functions
package array;

public class II_MergeArray_withoutInbuildFunctions {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArr = new int[length1 + length2];

        //put arr1 into merged array
        for(int i = 0; i < length1; i++){
            mergedArr[i] = arr1[i];
        }

        //put arr2 into merged array
        for (int i = 0; i < length2; i++){
            mergedArr[i + length1] = arr2[i];
        }

        // print merged array
        for(int i : mergedArr){
            System.out.print(i + " ");
        }
    }
}
