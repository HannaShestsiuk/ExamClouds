/**
 * Find common elements between two arrays
 * int[] array1 = {1, 2, 3, 4, 5};
 * int[] array2 = {4, 5, 6, 7, 8};
 */

package array;

import java.util.ArrayList;
import java.util.List;

public class IV_CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        List<Integer> commonElements = new ArrayList<>();

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    commonElements.add(array1[i]);
                }
            }
        }

        System.out.println("Common Elements are: " + commonElements);
    }
}
