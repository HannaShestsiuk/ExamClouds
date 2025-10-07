/**
 * Search element in an Array
 * int[] array = {5, 2, 9, 1, 6, 3};
 * int target = 6;
 */
package array;

public class VII_SearchElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};
        int target = 6;

        boolean isFound = false;

        for (int item : array){
            if (item == target) {
                isFound = true;
                break;
            }
        }
        if(isFound){
            System.out.println("The Target element " + target + " is found.");
        } else{
            System.out.println("The Target element " + target + " is NOT found.");
        }
    }
}
