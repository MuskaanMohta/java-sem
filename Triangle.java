class Triangle extends Shapes{
    double h,b;
    Triangle(double h,double b)
    {
        this.h=h;
        this.b=b;
    }
    @Override
    public void computeArea()
    {
        super.area = (0.5)*h*b;
    }
    @Override
    public void displayShape()
    {
        System.out.printf("Triangle(%.2f,%.2f) Area:%.2f\n",h,b,super.area);
    }
}