package Q1;

public class Point {

    private int x;
    public int y;

    public Point(int _x, int _y)
    {
        x = _x;
        this.y = _y;
        System.out.println("Point constructor with parameter.");
    }

    protected int GetX()
    {
        return this.x;
    }

    public void SetX(int x)
    {
        this.x = x;
    }

    public void Display()
    {
        System.out.print("X = " + x + " Y = " + y);
    }
}

