package Assignment;

public class Qs20 {
    public static void main(String[] args) {
        //20. Write a Java Program to find the transpose of a given matrix
        int[][]a = {{1,2,3},{2,3,5},{4,5,6}};
        for (int j = 0; j <a.length ; j++) {
            for (int i = 0; i <a.length ; i++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
