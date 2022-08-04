public class InheritanceDemo{

	public static void main(String[] args){

		Father f = new Father(); //object creation
		f.setName("Kumar");
		f.setAge(50);

		//System.out.println(f.getName() +" : "+ f.getAge());

        Child c = new Child();
        c.setName("Raj");
        System.out.println(c.getName() );
        f.childname="vignesh";


	}
}

class Father extends InheritanceDemo{ // parent class or super class or base class

	private String name;
	private int age;

	//getter and setter method
	public void setName(String name){ //name setter
		this.name=name; //this pointer
	}
	public void setAge(int age){ //age setter
		this.age=age;
	}
	public int getAge(){return age;}// get age
	public String getName(){return name;}// get name

	public void eat(){

		System.out.println("Eating....From father class");
	}
	public void work(){
		System.out.println("Working from father class");
	}
}

class Child extends Father{ // child class or sub class
     
     public String childname; //data
     // we can access all the public methods inside parent class
}