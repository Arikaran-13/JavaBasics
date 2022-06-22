public class Method_Overloading {
    public static void main(String[] args) {

        add(3,4);
        add(3.3f,4.5f);
        add(2,6);
        add(2,3,4);
        //polymorphism
        // method overloading and overraiding
        // abstraction
        // encapsulation
    }
    public static void add(int a,int b){ //  method overloading
        // methods has same method name but different datatype of argument
        // or diff num of argument
        System.out.println(a+b);
    }
    public static void add(float a,float b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){ //  method overloading
        System.out.println(a+b);
    }
}
