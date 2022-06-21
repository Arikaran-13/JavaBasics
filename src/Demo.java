public class Demo {
    private String name;
    private int age;
    Demo(String str , int a){
           name = str;
         age =a;
    }
    public static void main(String[] args) {
        Demo d  = new Demo("Ram",14);
        System.out.println(d.name);
    }
    public String getName(){
        return name;
    }
}
class A{
    public static void main(String[] args) {


        Demo d1 = new Demo("Kumar", 27);
        System.out.println(d1.getName());
    }
}