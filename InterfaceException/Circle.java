import java.util.*;
class Circle implements Shape{

    private double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    
    public double computeArea()
    {
        double a =Math.PI*radius*radius;
        return a;
    }
}