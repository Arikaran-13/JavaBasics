public class Cycle {
    public void display(){
        System.out.println("Cycle");
    }
      // 0,1,1,2,3,5,8,13,21
    public static void main(String[] args) {
        Cycle c = new Cycle();
        Cycle c1 = new Cycle(){
            @Override
            public void display() {
                System.out.println("Bike");
            }
        };
        c.display();
        c1.display();

    }
}
