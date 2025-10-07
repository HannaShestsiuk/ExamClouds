/**
 * Find the Largest Element in an Array
 * int[] arr = {1, 3, 5, 7, 9};
 */

package array;

public class III_MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        int arrLength = arr.length;

        int maxValue = 0;

        for(int i = 0; i < arrLength; i++){
            maxValue = Math.max(arr[i], maxValue);
        }
        System.out.println("The largest element in array is " + maxValue +".");
    }
}
