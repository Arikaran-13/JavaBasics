package Assignment;

import java.util.*;

public class Qs6 {
    public static void main(String[] args) {
        //Write a Java Program to iterate HashMap using While and advance for loop
        HashMap<String,Integer>  hm = new HashMap<String,Integer>();
        hm.put("Dairymilk",1);
        hm.put("Munch",3);
        hm.put("5star",2);

        for (Map.Entry me : hm.entrySet()){
            System.out.println(me.getKey()+" : "+me.getValue());
        }

        //3


    }
}
