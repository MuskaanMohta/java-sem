class Rectangle extends Shapes{
    double l,b;
    Rectangle(double l, double b)
    {
        this.l = l;
        this.b = b;
    }
    @Override
    public void computeArea()
    {
        super.area = l * b;

    }
    @Override
    public void displayShape()
    {
        System.out.printf("Rectangle(%.2f,%.2f) Area:%.2f\n",l,b,super.area);
    }
}