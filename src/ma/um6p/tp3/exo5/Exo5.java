package ma.um6p.tp3.exo5;

import java.util.Arrays;

public class Exo5 {
    public static int[][] matrixAdd(int[][] A,int[][] B){

        int[][] result =new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                result[i][j]=A[i][j]+B[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] M){
        for (int[] row : M) {
            System.out.println(Arrays.toString(row));
        }
    }


    public static void main(String[] args){
        int[][] A={{1,2,3},{4,5,6},{7,8,9}};
        int[][] B={{10,11,12},{13,14,15},{16,17,18}};
        int[][] C=matrixAdd(A,B);
        printMatrix(C);

    }

}
