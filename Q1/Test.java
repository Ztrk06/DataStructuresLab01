package Q1;

public class Test {

    public static void main(String[] args) {

        System.out.println("---------------------------------------");
        Point p = new Point(0, 0);
        System.out.println("---------------------------------------");
        Circle c = new Circle(2, 4);
        System.out.println("---------------------------------------");
        Circle c1 = new Circle();
        System.out.println("---------------------------------------");
        p.Display(); System.out.println();
        System.out.println("---------------------------------------");
        c.Display();
        System.out.println("---------------------------------------");
        c1.Display();
        System.out.println("---------------------------------------");
        System.out.println(c.Calculate(new Circle(9, 5)));}

}

