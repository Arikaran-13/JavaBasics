package Assignment;

import java.util.Arrays;

public class Qs12 {
    public static void main(String[] args) {

       int[]arr = {10,20,30,40,50};
        Arrays.parallelSort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
