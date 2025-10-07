/**
 * Распечатать 10 строк циклом while.
 * Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while.
 */
package lesson5;

public class V_TasksByWhile {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 10) {
            System.out.println("Task" + n++);
        }
    }
}
