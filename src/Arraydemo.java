import java.util.Arrays;

public class Arraydemo {
    public static void main(String[] args) {
       String [] arr ={"a","b","c","c","d"};
         Arrays.asList(arr).stream().distinct().forEach(System.out::println);
        //System.out.println(ans);


    }
}
