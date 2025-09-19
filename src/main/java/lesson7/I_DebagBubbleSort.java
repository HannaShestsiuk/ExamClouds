/**
 * Debug сортировки пузырьком.
 * Создать табличку для любого массива, в котором последовательно прописать значения i, j, массива для  каждого цикла алгоритма сортировки пузырька.
 * Используйте debugger.
 * Например, для массива 0 2 5 3 4:
 * Шаги дебага
 * i	j	Значение массива	Выполнился ли блок if?
 * 0	4	 0 2 5 3 4	-
 * 0	3	 0 2 3 5 4	+
 * 0	2	 0 2 3 5 4	-
 * 0	1	 0 2 3 5 4	-
 * 1	4	 0 2 3 4 5	+
 * 1	3	 0 2 3 4 5	-
 * 1	2	 0 2 3 4 5	-
 * 2	4	 0 2 3 4 5	-
 * 2	3	 0 2 3 4 5	-
 * 3	4	 0 2 3 4 5	-
 * 4	-	 0 2 3 4 5	-
 */
package lesson7;

import java.util.Arrays;

public class I_DebagBubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 9, 3, 5, 1};

        System.out.println("i j Array           If?");

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                boolean executedIf = false;

                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                    executedIf = true;
                }

                System.out.printf("%d %d %s  %s\n",
                        i,
                        j,
                        Arrays.toString(arr),
                        executedIf ? "+" : "-");
            }
        }
    }
}
