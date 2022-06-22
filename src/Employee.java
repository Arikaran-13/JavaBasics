public class Employee {
    private String name;
    private int age;
    private int sal;
// create student class , enter the related datas and function
    // swap 2 variables value a=3,b=5
    // reverse a number // 12345 => 54321
    //
    Employee(String name,int age,int sal){
        this.name=name; // this pointer
        this.age=age;
        this.sal=sal;
    }
    public void getName(){
        System.out.println(name);
    }
    public void getAge(){
        System.out.println(age);
    }
    public void getSal(){
        System.out.println(sal);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ram",25,30000);

        Employee e2 = new Employee("Kumar",25,30000);
        e1.getName(); // encapsulation
        e2.getName();// encapsulate
    }
}
