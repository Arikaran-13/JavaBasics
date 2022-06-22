package Assignment;

import java.util.Scanner;

//1  Write a Java Program to reverse a string without using String inbuilt function.
public class Qs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=str.length()-1;i>=0;i--) System.out.print(str.charAt(i));

        // 2 Write a Java Program to reverse a string using String inbuilt function.
        System.out.println();
        StringBuilder sb = new StringBuilder(str);
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1.reverse());
     //   System.out.println(sb.reverse());

        //3
      //  Write a Java Program to swap two numbers using the third variable.
        int a,b,c;
        System.out.println("Enter two integer num: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swap: "+a+" "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swap: "+a+" "+b);

        //4
        //Write a Java Program to swap two numbers without using the third variable.
        System.out.println("Enter two num: ");
        int k1=sc.nextInt();// 4
        int k2=sc.nextInt();//2
        System.out.println("Before swap: "+k1+" "+k2);
        k1=k1+k2;// 6
        k2=k1-k2;//6-2=4
        k1=k1-k2;//2
        System.out.println("After swap: "+k1+" "+k2);
        //5
        //
    }
}
