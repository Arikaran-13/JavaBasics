import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer number: ");
        int a = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        String str = sc.nextLine();
        boolean d1 = sc.nextBoolean();

        System.out.println(a);

    }
}
