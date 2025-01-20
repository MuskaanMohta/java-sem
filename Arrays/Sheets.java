import java.util.*;
public class Sheets
{
    static Shape createShape(int type,Scanner sc)
    {
        Shape obj;
        double a,b;
        switch(type)
        {
            case 1:
                obj = new Circle(sc.nextDouble());
                obj.computeArea();
                obj.findType();
                break;
            case 2:
                obj = new Rectangle(sc.nextDouble(),sc.nextDouble());
                obj.computeArea();
                obj.findType();
                break;
            case 3:
                obj = new Triangle(sc.nextDouble(),sc.nextDouble());
                obj.computeArea();
                obj.findType();
                break;
            default:
                System.out.println("Ignoring wrong tye");
                obj=null;
                break;
        }
        return obj;
    }
        public static void main(String args[])
        {
            Shape Shapes[] = new Shape[50];
            int n,i=0,sheetType;
            Shape s;
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextInt())
            {
                sheetType=sc.nextInt();
                if(sheetType==-1)
                    break;
                s=createShape(sheetType,sc);
                if(s!=null)
                {
                    Shapes[i++]=s;
                }

            }
            n=i-1;
            Arrays.sort(Shapes,0,i,new Comparator<Shape>()
            {
                @Override
                public int compare(Shape s1,Shape s2)
                {
                    if(s1.area>s2.area)
                        return 1;
                    else if(s1.area<s2.area)
                        return -1;
                    else
                        return 0;
                }
            });
            for(int j=0;j<n+1;j++){
                System.out.printf("%d: %s Area:%.2f\n",j,Shapes[j].type,Shapes[j].area);
            }

        }
    
}