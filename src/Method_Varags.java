public class Method_Varags {

    // method variable length
    public static void main(String[] args) {
        add(2,4);
        add(2,3,4,4,5,5,6,6,7,7,8,8,6,5,4,3,2,2,12);
        add(1,2,3);
        add(4,5,6,76);
    }
    public static void add(int ... values ){// variable length argument
        int sum=0;
        for(int i=0;i< values.length;i++){
            sum += values[i];
        }
        System.out.println(sum);
    }

}
