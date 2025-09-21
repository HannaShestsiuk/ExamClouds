/**
 * Создать класс "Матрица".
 * Класс должен иметь следующие переменные:
 * - двумерный массив вещественных чисел;
 * - количество строк и столбцов в матрице.
 * Класс должен иметь следующие методы:
 * - сложение с другой матрицей;
 * - умножение на число;
 * - вывод на печать;
 *  -умножение матриц.
 */
package lesson9;

public class III_Matrix {
    private double[][] matrix;
    private int rows;
    private int columns;

    public III_Matrix(double[][] matrix, int rows, int columns) {
        this.matrix = matrix;
        this.rows = rows;
        this.columns = columns;
    }

    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        double[][] matrix2 = {{7, 8, 9}, {1, 2, 3}};
    }
}
