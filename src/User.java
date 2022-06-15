public class User {

    public static void main(String[] args) {
        Instagram_Signup logesh =  new Instagram_Signup(); // object creation
       Instagram_Signup user2 =  new Instagram_Signup();

       /* logesh.name="logesh";
        logesh.pass="abc123%6";
        System.out.println(logesh.name);
        System.out.println(logesh.pass);
        logesh.name="Ari";
        logesh.pass="ari@123";
        System.out.println(logesh.name);
        System.out.println(logesh.pass);*/
        logesh.setName("logesh");
        logesh.getName();
       user2.setName("alex");
        user2.getName();



    }
}

class Instagram_Signup{
   private String name;
    private String pass;

    public void login(){
        System.out.println("login successfully");
    }
    public void forgetpass(){
        System.out.println("Pls enter your email address");
        System.out.println("update your new pass: ");
        System.out.println("updates successfully");
    }
    public void setName(String n){
        name=n;
    }
    public void getName(){
        System.out.println(name);
    }
    public void setpass(String n){
        pass=n;
    }
    public void getpass(){
        System.out.println(pass);
    }
}
