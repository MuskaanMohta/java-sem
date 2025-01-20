class Triangle extends Shape{
    double b,h;
    Triangle(double b,double h)
    {
        this.b=b;
        this.h=h;
    }
    public void computeArea()
    {
        area=(0.5)*b*h;
    }
    public void findType()
    {
        type="Triangle("+b+","+h+")";
    }
}