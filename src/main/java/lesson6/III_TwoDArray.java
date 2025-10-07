/**
 * Двумерный массив типа String.
 * Создать массив типа String размером 3х6.
 * И записать в него значения:
 * a1  a2  a3  a4  a5  a6
 * b1  b2  b3  b4  b5  b6
 * c1  c2  c3  c4  c5  c6
 * Распечатать массив.
 */
package lesson6;

import java.util.Arrays;

public class III_TwoDArray {
    public static void main(String[] args) {
        char item = 'a';
        String[][] twoDArray = new String[3][6];
        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                twoDArray[i][j] = item + "" + (j + 1);
                //System.out.print(twoDArray[i][j] + " ");
            }
            item++;
            //System.out.println();
        }
        System.out.println(Arrays.deepToString(twoDArray));
    }
}
