package Assignment;

import java.util.ArrayList;

public class Qs10 {
    public static void main(String[] args) {
        //10
        //Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(23);
        al.add(45);
        al.add(90);
        //for loop
        for (int i = 0; i <al.size() ; i++) {
            System.out.println(al.get(i));
        }
        // while
        System.out.println("----------while");
        int k =0;
        while(k<al.size()){
            System.out.println(al.get(k++));
        }
        System.out.println("--------for each");
        for(Integer i : al){
            System.out.println(i);
        }
    }
}
