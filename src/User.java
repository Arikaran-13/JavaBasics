public class User{
       
       private int id;
       private String name;

	 public static void main(String[] args){
           
           User u1 = new User();
           u1.id=1;
          // u1.name="Ram";

           Worker w1 = new Worker();
           // getter and setter method
           w1.setId(2); //calling
           w1.setName("Raj");

           System.out.println(w1.getName());
           System.out.println(w1.getId());



           
	 }
}

class Worker{

	private int id;
	private String name;

public void setName(String name){
	this.name=name;
}
public void setId(int id){
	this.id=id;
}
public String getName(){
	return name;
}
public int  getId(){
	return id;
}

}