package Streams_Api;



import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// find the first non-repeated character in it using Stream functions
public class Practise {
    public static void main(String[] args) {
        String str = "Nothing lasts long";
        Character ch = str.chars()
                .mapToObj(i-> Character.valueOf((char)Character.toLowerCase(i)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i->i.getValue()==1)
                .map(i->i.getKey())
                .findFirst()
                .get();
        System.out.println(ch);
    }
}
