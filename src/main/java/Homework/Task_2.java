//2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и
//        с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
//        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
//        элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

package Homework;

public class Task_2 {
    public static void Start(){
        int size = 10;
        int[][] matrix = CreateMatrix(size);
        PrintMatrix(FillDiagonals(matrix));
    }
    private static int[][] CreateMatrix(int size) {
        return new int[size][size];
    }
    private static int[][] FillDiagonals(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j || (i+j+1) == matrix.length) matrix[i][j] = 1;
            }
        }
        return matrix;
    }
    private static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
