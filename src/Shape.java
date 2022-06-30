abstract class  Shape {
    protected int l,b;
    public abstract void area();
    Shape(int l ,int b){
//public,private,protected
    }
    public void getL(){
        System.out.println(l);
    }
}

class Triangle extends Shape{
    private int th;
    private int brd;
Triangle(int a,int b){
    super(a,b);
}

    @Override
    public void area() {

    }
}
class Square extends  Shape{

    Square(int l, int b) {
        super(l, b);
    }

    @Override
    public void area() {
        System.out.println("From square");
    }
}
class Rectangle extends Shape{

    Rectangle(int l, int b) {
        super(l, b);
    }

    @Override
    public void area() {
        System.out.println("From rectangle");
    }
}
