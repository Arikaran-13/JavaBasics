package Assignment;

import java.util.Scanner;

public class Qs7 {
    public static void main(String[] args) {
        //Write a Java Program to find whether a number is prime or not.
        System.out.println("Enter a num: ");
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        boolean flag = true;
        for(int i =2;i<num;i++){
            if(num%i==0)flag=false;
        }
        if(flag) System.out.println("Prime");
        else System.out.println("Not prime");
    }
}
