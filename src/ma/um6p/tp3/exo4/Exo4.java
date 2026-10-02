package ma.um6p.tp3.exo4;

import java.util.Arrays;

public class Exo4 {
    public static void copyColumn(int[][] matrix){
        int secCol=1;
        int fifCol=4;
        for(int i=0;i<matrix.length;i++){
            matrix[i][fifCol]=matrix[i][secCol];
        }

    }

    public static void main(String[] args){
        int[][] matrix = {
                { 1,  2,  3,  4,  5,  6,  7,  8},
                { 9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32},
                {33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48}
        };
        System.out.println("Avant :");

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        copyColumn(matrix);
        System.out.println("Apres :");

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

    }
}
