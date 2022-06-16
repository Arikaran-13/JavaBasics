public class ConstructorDemo { // constructor

    public static void main(String[] args) {
        School s = new School("jvis",12); // constructor
        System.out.println(s.getName());
        System.out.println(s.getclasses());


    }
}
class School{

    private String sklname;
    private int classes;

    School(String str,int cl){
        sklname =str;
        classes=cl;

    }


    public String getName(){return sklname;}
    public void setName(String n){sklname = n;};
    public int getclasses(){return classes;}


}