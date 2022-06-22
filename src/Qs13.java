package Assignment;

public class Qs13 {
    public static void main(String[] args) {
       // Write a Java Program to check Armstrong number.
        int num=153;
        int temp=num;
        int rem;
        int ans=0;
        while(num>0){
            rem = num %10;

            ans += rem*rem*rem;
            num=num/10;
        }
        if(ans==temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an armstrong");
        }

    }
}
