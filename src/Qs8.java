package Assignment;

import java.util.Scanner;

public class Qs8 {
    public static void main(String[] args) {
        //Write a Java Program to find whether a string or number is palindrome or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");

        String str = sc.nextLine();
     String rev="";
     for(int i = str.length()-1;i>=0;i--){
         rev=rev+str.charAt(i);
     }
        if(str.equals(rev))System.out.println("Palindrome");

        else System.out.println("Not a palindrome");
    }
}
