/**
 * Remove duplicates from an Array
 * int[] array = {5, 2, 9, 1, 6, 2, 5};
 */
package array;

import java.util.Arrays;

public class V_RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 2, 5};

        int arrayLength = array.length;
        int[] temp = new int[arrayLength];
        int tempLength = 0;

        for (int i = 0; i < arrayLength; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < tempLength; j++) {
                if (array[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[tempLength] = array[i];
                tempLength++;
            }
        }

        int[] result = Arrays.copyOf(temp, tempLength);
        System.out.println("New array with removed duplicates: " + Arrays.toString(result));
    }
}
