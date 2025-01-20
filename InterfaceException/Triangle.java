class Triangle implements Shape{
    private double b,h;
    Triangle(double b,double h)
    {
        this.b=b;
        this.h=h;
    }
    public double computeArea()
    {
        double a = (0.5)*b*h;
        return a;
    }
}