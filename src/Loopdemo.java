import java.util.Scanner;

public class Loopdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark;
        int count=0;
       /* while(count<5){
            mark=sc.nextInt();
            System.out.println(mark);
            count=count+1;
        }*/
        /*for (int i = 0; i <5 ; i=i+1) { // initialisation, condition checking, increment or decrement
            mark=sc.nextInt();
            System.out.println(mark);

        }*/

        do{ // atleast 1 time
            System.out.println("Enter your marks: ");
           mark=sc.nextInt();
            System.out.println(mark);
            count=count+1;

        }while(count<5);
    }
}
