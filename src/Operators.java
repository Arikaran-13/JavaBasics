public class Operators {
    public static void main(String[] args) {
        // arithmatic operator // +,-,*,/,%
        //relational operator // > , < >=, <= , ==, !=
        //logical
        //bitwise
        //increment or decrement operators

        //add//sub//multi//div
       int a=5;
        int b=9;
        System.out.println(a>b);//greater
        System.out.println(a<b);//lesser
        System.out.println(a>=b); //a>b or a==b // a greater thn or equal to b
        System.out.println(a<=b);// b greater thn or equal to a
     //   System.out.println(a==b); // % => remainder
        System.out.println(a!=b);// not equal

        //bitwise operator
        // binary numbers
        int c=2; //integer
        int d =3;

        System.out.println(2 & 3);
        System.out.println(2 | 3);
        System.out.println(2^3);

        // 35 , 25
        // bianry num
        // 35 & 25
        // 35 ! 25

       // 1001 , 1100  => decimal number
//


        int e =5;
        System.out.println(a);
        e=e+1; // a++
        System.out.println(a);

        System.out.println(a++);
        System.out.println(a); // increment operation // last

        System.out.println("pre increment: "+ ++a); // first it will do the increment operatio

        System.out.println("----------");
//decrement
        int h = 6;
        System.out.println(h--);
        System.out.println(h);
        System.out.println(--h);

// <<
        //>>
        System.out.println("---------");
        System.out.println(5<<2); //5*2=10 //left shift

        System.out.println("------"); // right shift
        System.out.println(6>>2); // 6/2= 3




    }
}
