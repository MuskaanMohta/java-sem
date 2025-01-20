import java.util.*;
public class ShapeDemo
{
    public static void main(String args[])
    {
        int type;
        Shape s;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt())
        {
            type=sc.nextInt();
            switch(type)
            {
                case 0:System.exit(0);
                case 1:
                    s=new Circle(sc.nextInt());
                    System.out.printf("Circle: %.2f\n",s.computeArea());
                    break;
                case 2:
                    s=new Rectangle(sc.nextInt(),sc.nextInt());
                    System.out.printf("Rectangle: %.2f\n",s.computeArea());
                    break;
                case 3:
                    s=new Triangle(sc.nextInt(),sc.nextInt());
                    System.out.printf("Triangle: %.2f\n",s.computeArea());
                    break;
                default:
                    System.out.println("Invalid type");
            }
        }
    }
}