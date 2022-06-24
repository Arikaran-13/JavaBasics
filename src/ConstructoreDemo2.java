public class ConstructoreDemo2 {
    private String name;
    private int age;

    ConstructoreDemo2(String str, int k){
        name =str;
        age=k;
    }
    public void  getName(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        ConstructoreDemo2 c = new ConstructoreDemo2("Ari",22);
        ConstructoreDemo2 c1 = new ConstructoreDemo2("Nirus", 14);
        c1.getName();
        System.out.println(c.age);
    }
}
