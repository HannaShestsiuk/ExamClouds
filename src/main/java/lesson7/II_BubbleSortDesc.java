/**
 * Модифицировать сортировку пузырьком.
 * Изменить программу сортировки пузырьком:
 * а) добавить возможность досрочного окончания сортировки;
 * б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
 * Измените программу так, чтобы минимальный элемент "всплывал" в конец массива
 * (внутренний цикл for должен перебирать элементы не с конца, а с начала).
 */
package lesson7;

public class II_BubbleSortDesc {
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 5, 1};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        sort(arr);

        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }

    public static void sort(int[] array) {
        boolean swapped;
        int swapCount = 0;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                    swapCount++;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("Array is sorted in " + swapCount + " step(s).");
    }
}
