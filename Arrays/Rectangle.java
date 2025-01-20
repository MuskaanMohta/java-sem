class Rectangle extends Shape
{
    double l,b;
    Rectangle(double l,double b)
    {
        this.l=l;
        this.b=b;
    }
    public void computeArea()
    {
        area=l*b;
    }
    public void findType()
    {
        type="Rectangle("+l+","+b+")";
    }
}