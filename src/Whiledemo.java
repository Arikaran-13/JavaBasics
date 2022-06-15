import java.util.Scanner;

public class Whiledemo {
    public static void main(String[] args) {
          /*  notes:  do => pannu
        do{
// one time task must be completed
        }
        while(condtion);
*/
        /* notes : for:
        int marks;
        for(int i=0; i<4; i++) // declaration
        // condition checking
        {                              // increment operator
            Scanner sc = new Scanner(System.in);
            marks= sc.nextInt();
            sout(marks);

        }*/
        int marks; // create a variable
        Scanner sc = new Scanner(System.in); // user input
        int count =0;
        while(count<5) {
            System.out.println("Enter the marks: ");
            marks = sc.nextInt(); // userinput storing
            System.out.println(marks);
            count++;
        }



       for(int i=0;i<5;i++){
            System.out.println("Enter the marks: ");
            marks = sc.nextInt();
            System.out.println(marks);
        }



        do{
            System.out.println("Enter the marks: ");
            marks = sc.nextInt(); // at least one time
            System.out.println(marks);
            count++;
        }while(count<5);


    }
}
