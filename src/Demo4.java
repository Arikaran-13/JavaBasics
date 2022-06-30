public class Demo4 {
    public static void main(String[] args) {
        Company c = new Google();
        c.increment();
    }
}
interface Company{
    void increment();
    default void work(){
        System.out.println("work 8 hours");
    }
}
class Google implements Company{

    @Override
    public void increment() {
        System.out.println("34LPA");
    }
}