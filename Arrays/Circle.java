import java.util.*;
class Circle extends Shape{
    double r;
    Circle(double r)
    {
        this.r=r;
    }
    @Override
    public void computeArea()
    {
        area=Math.PI*r*r;
    }
    @Override
    public void findType()
    {
        type="Circle("+r+")";
    }
}