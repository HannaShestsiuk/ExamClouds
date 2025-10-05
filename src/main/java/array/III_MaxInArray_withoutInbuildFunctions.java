/**
 * Find the Largest Element in an Array
 * int[] arr = {1, 3, 5, 7, 9};
 */
package array;

public class III_MaxInArray_withoutInbuildFunctions {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        int max = 0;
        for (int i = 0; i < arr.length - 1; i++){
            max = arr[arr[i] < arr[i + 1] ? i + 1 : i];
        }
        System.out.println();
        System.out.println("Max value in the array is " + max);
    }
}
