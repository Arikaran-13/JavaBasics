package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Qs11 {
    public static void main(String[] args) {

        String str = "aabrakadabbra";
        str.chars().mapToObj(i->Character.valueOf((char)i)).map(i->i+"").distinct().forEach(i-> System.out.println(i));


    }
}
