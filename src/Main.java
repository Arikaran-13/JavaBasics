import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static int printSum(int n,int[]arr,int k){
        List<Integer> l = Arrays.stream(arr).boxed().collect(Collectors.toList());
        ArrayList<List<Integer>> ll = new ArrayList<>();
        int beg=0,end=k,sum=0,j=0;
        List<Integer> a = l.subList(beg,end);
        ll.add(a);
        while(true){
            end=(2*k);
            if(end>=k){
                List<Integer> b = l.subList(end,l.size());
                ll.add(b);
                break;
            }
            else {
                List<Integer> b = l.subList(end, (2 * k) + k);
                ll.add(b);
            }
        }

        while (j<ll.size()) {
            List<Integer> x = ll.get(j);
            for(Integer y :x) {
                sum+=y;
            }
            j++;
        }
        System.out.println(ll);
        System.out.println(l);
return sum;


    }
    public static void main(String[] args) {

        int arr[]={1,5,9,7,8,6,4,3,2,1,0,5,8,7};
        int n=14;
        int k=5;
        System.out.println(  printSum(n,arr,k));

    }
}
