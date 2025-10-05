/**
 * Find the largest and smallest element in an Array
 * int[] array = {5, 2, 9, 1, 6, 3};
 */

package array;

public class VI_MinAndMax_withoutInbuildFunctions {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};

        int maxValue = array[0];
        int minValue = array[0];

        for (int i = 0; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println("The largest element in array is " + maxValue +".");
        System.out.println("The smallest element in array is " + minValue +".");
    }
}
