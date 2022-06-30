public class Demo2 {
    public static void main(String[]args){
        Mechanic mech = new Mechanic();

        Vehicle v1 = new Car();
        Vehicle v2=new Bike();
        mech.checkUp(v1);
        mech.checkUp(v2);

    }
}
interface Vehicle{

    int a=10;
      void display();
      void welcome();

}
interface Standards{

}
class B{
        // interface used for multiple inheritance
    //// default public abstract
    // we will use implements keyword
    // no obj
    //se t of rules
}
class Car implements Vehicle , Standards
{
    public void display(){
        System.out.println("from car");
    }


    public void welcome() {

    }
}
class Bike implements Vehicle{
    public void display(){
        System.out.println("from bike");
    }

    @Override
    public void welcome() {

    }
}
class Mechanic{
    public void checkUp(Vehicle v){
        v.display();
    }
}