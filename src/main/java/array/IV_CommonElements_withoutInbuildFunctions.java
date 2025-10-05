/**
 * Find common elements between two arrays
 * int[] array1 = {1, 2, 3, 4, 5};
 * int[] array2 = {4, 5, 6, 7, 8};
 */
package array;

public class IV_CommonElements_withoutInbuildFunctions {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int commonElement;

        for (int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]){
                    commonElement = array1[i];
                    System.out.println("Common element is " + commonElement);
                }
            }
        }
    }
}
