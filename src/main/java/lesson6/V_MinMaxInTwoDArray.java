/**
 * Поиск максимального и минимального значения в каждой строке массива.
 * Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать массив, содержащий максимальное и минимальное значение.
 */
package lesson6;

import java.util.Arrays;

public class V_MinMaxInTwoDArray {
    public static void main(String[] args) {
        int[][] arrayTwoD = {
                {5, 7, 9, 0, 45, 12, 41, 100},
                {5, 7, 9, 2, 120, 12, 41, 100},
                {5, 284, 9, 14, 45, 12, 41, 100},
                {1, 7, 9, 847, 45, 12, 41, 100},
                {15, 7, 9, 20, 45, 12, 41, 100}
        };

        int[][] minMax = new int[5][2];

        for (int i = 0; i < arrayTwoD.length; i++) {

            Arrays.sort(arrayTwoD[i]);

            minMax[i][0] = arrayTwoD[i][0];
            minMax[i][1] = arrayTwoD[i][arrayTwoD[i].length - 1];
        }
        System.out.println(Arrays.deepToString(minMax));
    }
}
