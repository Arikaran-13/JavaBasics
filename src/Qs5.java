package Assignment;

import org.apache.poi.xddf.usermodel.HasShapeProperties;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qs5 {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer>hm = new HashMap<Character,Integer>();
        char [] ch = str.toCharArray();
        for(char c : ch){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> me : hm.entrySet()){
            System.out.println(me.getKey() +" : "+me.getValue());
        }

        }
    }

