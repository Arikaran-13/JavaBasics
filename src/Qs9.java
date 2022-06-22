package Assignment;

public class Qs9 {
    public static void main(String[] args) {

        int a =0,b=1,c;
        System.out.print(a+" "+b);

        for(int i=0;i<5;i++){
            c=a+b;
            System.out.print(c+" ");
            b=c;
            a=b;
        }


    }
}
