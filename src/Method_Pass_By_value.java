public class Method_Pass_By_value {
    public int a=10;// global variables
    public static void main(String[] args) {
        int a =10;

       incr(a); // pass by value // data safe
        System.out.println(a);
        //++ => 1

    }
    public static void incr(int a){
        ++a;//11
    }
}
