

import java.util.Scanner;

public class DEMO3 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        //System.out.println(a);
        System.out.println("Enter the number: ");
        a=sc.nextInt();// user input

        //float
        System.out.println("Enter the float number: ");
        float f= sc.nextFloat();
        System.out.println(f);
        System.out.println("Enter the double number: ");
        double d = sc.nextDouble();
        System.out.println(d);
        System.out.println("Enter the long number: ");
        long l = sc.nextLong();
       // fun();
        System.out.println(l);
        System.out.println("Enter the String : ");

        String s = sc.nextLine();
        System.out.println(s);


        System.out.println(a);
    }
    //int fun() {return 20;}
}
