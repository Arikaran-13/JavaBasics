public class Main1 { // cosmic super class
    public static void main(String[] args) {

       int i = 5;
       int b=0;

    try {
        System.out.println(i / b);
        System.out.println("Hi");
    }catch(Exception e){
        System.out.println("mistake will be corrected");
    }
      finally {
        System.out.println("Hi");
    }
    }
}
