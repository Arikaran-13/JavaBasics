public class Box {
    private int len;
    private int brd;

    Box(int l, int brd) {
       this. len = l; // this pointer
       this. brd = brd;
    }

        public void getLen() {
            System.out.println(len);
        }
        public void getBrd() {
            System.out.println(brd);

        }
    public void incrlen() {
        len++;
    }



    public static void main(String[] args) {
        Box newbox = new Box(4,8);
     newbox.incrlen();
        System.out.println();



    }
}
