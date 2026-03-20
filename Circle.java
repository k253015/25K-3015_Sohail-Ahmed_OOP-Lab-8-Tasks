

interface Shape{
    void area();
}

class Rectangle implements Shape{
    int Length;
    int Width;
    int RectangleArea;

    Rectangle(int Length,int Width){
        this.Length = Length;
        this.Width = Width;
    }

    @Override
    public void area(){
        RectangleArea = Length * Width;
        System.out.println("The Area Of Rectangle is:"+RectangleArea);
    }
}
public class Circle implements Shape{
    int radius;
    double CircleArea;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void area(){
        CircleArea = 3.142 * radius * radius;
        System.out.println("The Area of Circle is:"+CircleArea);
    }
    public static void main(String[] args){
        Shape C = new Circle(7); // C stands for Circle object
        Shape R = new Rectangle(5,9); // R stands for Rectangle object
        C.area();
        R.area();
    }
}
