/**
 * Find the largest and smallest element in an Array
 * int[] array = {5, 2, 9, 1, 6, 3};
 */
package array;

public class VI_MinAndMax {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};

        int maxValue = array[0];
        int minValue = array[0];

        for(int item : array){
            maxValue = Math.max(item, maxValue);
            minValue = Math.min(item, minValue);
        }
        System.out.println("The largest element in array is " + maxValue +".");
        System.out.println("The smallest element in array is " + minValue +".");
    }
}
