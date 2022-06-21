package Assignment;

public class Qs18 {
    public static void main(String[] args) {
      // Write a Java Program to find the frequency of odd and even numbers in given matrix
        int[][]a = {{1,2,3},{2,3,5},{4,5,6}};
        int even=0,odd=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                if(a[i][j] %2 ==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("No. of Even: "+even);
        System.out.println("No . of odd: "+odd);
    }
}
