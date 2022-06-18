public class OperatorsDemo {
    //operators
    // Arithmatic,logical.relational,bitwise
    //Arithmetic or maths
    // +,-,*,/,%
    public static void main(String[] args) {

        int a = 4;
        int b = 6;   // % modulo => remainder
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
// operator   a  +  b //operand
        //relational
        // 10,12 => not equal, 10 smaller, 12 larger
        // > , < , >= , <= == , !=
        System.out.println("-------------");
        System.out.println(a>b);// 4,6
        System.out.println(a<b);
        System.out.println(a>=b); //a>b or a==b
        System.out.println(a<=b); // a<b or a==b
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println("-------------");

        // bitwise or logical operator // binary lang
        // and, or , not , xor
        // &   , | , ! , ^
        /*
        0 & 1 => 0   // a>b & a!=b = false // a*b
        0 & 0 => 0
        1 & 0 => 0
        1 & 1 => 1
        -----------------
        0 | 1 => 1  // a>b & a!=b = false // a+b
        0 | 0 => 0
        1 | 0 => 1
        1 | 1 => 1
        -------------------- xor // strict or
        0 ^ 1 => 1
        0 ^ 0 => 0
        1 ^ 0 => 1
        1 ^ 1 => 0

       -------- not
       1 ! = 0
       0 ! =1


*/
        System.out.println(0 & 1);
        System.out.println(0 | 1);
        System.out.println(23 & 24);
        System.out.println(5 | 5);
        System.out.println(23 ^ 7);

        System.out.println("Enter the number: ");

    }

}
