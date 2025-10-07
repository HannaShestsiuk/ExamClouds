/**
 * Debug сортировки выбором.
 * Сделать задание 1 для алгоритма сортировки выбора.
 * Изменить сортировку выбором - исключите обмен значений, если найденный минимальный элемент уже находится
 * на своем месте.
 */
package lesson7;

public class III_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 5, 1};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        sort(arr);

        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }

            if (pos != i) {
                array[pos] = array[i];
                array[i] = min;
            }
        }
    }
}
