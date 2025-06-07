package ex017_Arrays;

public class Lab161_Array_Iterrrate_ForLoop {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int i=0;i<matrix.length;i++){ // rows
            for(int j=0;j<matrix[i].length;j++){ // columns
              //  System.out.print(matrix[i][j]);
                System.out.print("*");

            }
            System.out.println();
        }
    }



}
