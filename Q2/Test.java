package Q2;

public class Test {
    public static void main(String[] args) {
        Circle icircle1 = new Circle(5);
        Rectangle irectangle1 = new Rectangle(3,4);
        Triangle itriangle1 = new Triangle(7,8,9);

        Shape[] shapes = {icircle1,irectangle1,itriangle1} ;
        for(Shape s:shapes){
            System.out.println("---------------------------");
            System.out.println("Type: " + s.type());
            System.out.println("Area: " + s.area());
            System.out.println("Perimeter: " + s.perimeter());
        }
    }
}

