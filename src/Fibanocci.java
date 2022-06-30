public class Fibanocci {
    public static void main(String[] args) {
        int a =0,b=1,c;
        // 0 , 1, 1 , 2,3,5,8,13,21
        System.out.print(a+" "+b+" ");
for(int i=0;i<7;i++) {
    c = a + b; // a=0,b=1
    System.out.print(c+" ");
    a = b;
    b = c;
}

    }
}
