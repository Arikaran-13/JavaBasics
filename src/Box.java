public class Box {
    private int len;
    private int brd;
   public static int count;

    Box(int l, int brd) {
        count++;
       this. len = l; // this pointer
       this. brd = brd;
    }

    static{
        count=0;
        System.out.println("Helo");
    }

        public  void getLen() {
            System.out.println(len);
        }
        public void getBrd() {
            System.out.println(brd);

        }
        public void getCount(){
            System.out.println(count);
        }


    public static void main(String[] args) { // command line argument
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }
        Box newbox = new Box(4,8);

        newbox.getLen();
        //getLen();
        System.out.println("Hi");


    }
}
