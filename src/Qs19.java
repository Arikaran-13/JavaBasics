package Assignment;

public class Qs19 {
    public static void main(String[] args) {
       // Write a Java Program to find the sum of each row and column of a matrix
        int[][]a = {{1,2,3},{2,3,5},{4,5,6}};
        int sumcol=0,sumrow=0,k=0;
        for (int i = 0; i <a.length ; i++) {

            for (int j = 0; j <a.length ; j++) {
                  sumrow+=a[i][j];
                  sumcol += a[j][i];
            }
            System.out.println("Sum of row: "+ i+" : "+sumrow);
            sumrow=0;
            System.out.println("SUm of col: "+k+" : "+sumcol);
            sumcol=0;
        }

    }
}
