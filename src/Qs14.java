package Assignment;

public class Qs14 {
    public static void main(String[] args) {
        //Write a Java Program to remove all white spaces from a string with using replace().
        String str = "All is well";

        System.out.println(str.replace(" ",""));
//-------------------------------
        String regex = "\\s";
        System.out.println(str.replaceAll(regex,""));
        //-----------------
        String res="";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == ' '){
                continue;
            }
            else res+=str.charAt(i);
        }
        System.out.println(res);
    }
}
