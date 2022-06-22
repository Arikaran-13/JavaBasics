package Assignment;

import java.util.Arrays;

public class Qs17 {
    //17. Write a Java Program to multiply two matrices
    public static void main(String[] args) {
        int r=3,col=3;
        int[][]a = {{1,2,3},{2,3,5},{4,5,6}};
        int[][]b = {{9,8,1},{1,1,2},{3,4,5}};
        int [][]c = new int[r][col];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <col ; j++) {
                c[i][j] = a[i][j]*b[i][j];

            }

        }
        for (int i=0;i<r;i++) {
            for (int j=0;j<col;j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
