package Assignment;

public class Qs9_2 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(   fibo(n));
    }

    public static int  fibo(int i) {
        if(i==0){
            return 0;
        }
        else if (i==1)return 1;
        else
        return (fibo(i-1)+fibo(i-2));
    }
}
