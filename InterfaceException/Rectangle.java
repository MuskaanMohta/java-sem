class Rectangle implements Shape{
    private double l,b;
    Rectangle(double l,double b)
    {
        this.l=l;
        this.b=b;
    }
    public double computeArea()
    {
        double a=l*b;
        return a;
    }
}