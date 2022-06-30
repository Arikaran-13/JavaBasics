public class Stringrev {
    public static void main(String[] args) {
        String str = "chennai";
        System.out.println(str);
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

    }
}
