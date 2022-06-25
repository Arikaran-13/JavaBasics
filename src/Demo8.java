public class Demo8 {
    public static void main(String[] args) {
        Employe e1 = new Employe("aarthi",25000);//parent
        Manager m = new Manager("Ram",45000,5000);//child
        System.out.println(m.getSal());

       // is - a relationship


    }
}
