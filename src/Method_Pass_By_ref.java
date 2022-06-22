public class Method_Pass_By_ref {

    public static void main(String[] args) {
        Box b = new Box(2,4); //Box@65ab7765
        System.out.println(b);
        b.incrlen(); // pass by reference
       b.getLen();

    }
}
