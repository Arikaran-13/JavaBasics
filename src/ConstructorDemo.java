public class ConstructorDemo { // constructor

    public static void main(String[] args) {
        School s = new School(); // constructor
        s.setName("jvis");
        System.out.println(s.getName());
    }
}
class School{

    private String sklname;
    private int classes;

    public String getName(){return sklname;}
    public void setName(String n){sklname = n;};


}