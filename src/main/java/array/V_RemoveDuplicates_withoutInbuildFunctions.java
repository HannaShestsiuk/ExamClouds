/**
 * Remove duplicates from an Array
 * int[] array = {5, 2, 9, 1, 6, 2, 5};
 */
package array;

public class V_RemoveDuplicates_withoutInbuildFunctions {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 2, 5};

        int[] temp = new int[array.length];
        int countUnique = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < countUnique; j++) {
                if (array[i] == temp[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[countUnique] = array[i];
                countUnique++;
            }
        }

        // Create an array with only the unique elements
        int[] uniqueArr = new int[countUnique];
        for (int i = 0; i < countUnique; i++) {
            uniqueArr[i] = temp[i];
        }

        for (int i = 0; i < uniqueArr.length; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
    }
}
