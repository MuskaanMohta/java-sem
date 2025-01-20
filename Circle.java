class Circle extends Shapes
{
    double radius;
    Circle(double r)
    {
        radius = r;
    }
    @Override
    public void computeArea()
    {
        super.area = Math.PI *radius*radius;
    }
    @Override
    public void displayShape()
    {
        System.out.printf("Circle(%.2f) Area:%.2f\n",radius,super.area);
    }
}