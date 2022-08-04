public class Demo{
	public static void main(String[]args){

		Employee emp1 = new Employee(); //parent
		emp1.setId(1);
		emp1.setName("raj");
		emp1.setSal(40000);  

		System.out.println(emp1.getName());
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getSal());
System.out.println("----------------------------");
		Manager m1 = new Manager(); //child

		m1.setId(24);
		m1.setName("m1");
		m1.setSal(70000);
		m1.setBonus(10000);

		System.out.println(m1.getName());
		System.out.println(m1.getEmpId());
		System.out.println(m1.getSal());
		System.out.println(m1.getBonus());

		System.out.println("----------------");
		System.out.println(m1.name);


	}
}

class Employee{ // parent class or super or base 
   
   private int empId;
  private String name;
   private int sal;
//getter and setter method

   public void setId(int id){ // id set
   	this.empId=id;
   }

   public void setName(String name){// name set
   this.name=name;
   } 

   public void setSal(int sal){// sal set
   this.sal=sal;
   } 

   public int getSal() {

System.out.println("From employee class");
return sal;


}
   public String getName(){return name;}
   public int getEmpId(){return empId;}


}
class Manager extends Employee{ // child class or sub
       
       private int bonus; //data

       public void setBonus(int b){ // set
       	this.bonus=b;
       }
       public int getBonus(){ // get
       	return bonus;
       }

       @Override
       public int getSal(){
       	System.out.println("From Manager class");

       	return super.getSal()+bonus;
       	
       } // method overriding
}
