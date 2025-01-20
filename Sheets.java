import java.util.*;
public class Sheets
{
    static Shapes createShape(int type, Scanner sc)
    {
        Shapes obj = new Shapes();
        switch(type)
        {
            case 1:
                System.out.println("Circle Detected\n");
                Circle c = new Circle(sc.nextDouble());
                c.computeArea();
                obj = c;
                break;
            case 2:
                System.out.println("Rectangle Detected\n");
                Rectangle r = new Rectangle(sc.nextDouble(),sc.nextDouble());
                r.computeArea();
                obj=r;
                break;
            case 3:
                System.out.println("Triangle detected\n");
                Triangle t = new Triangle(sc.nextDouble(),sc.nextDouble());
                t.computeArea();
                obj = t;
                break;
            default:
                System.out.printf("Ignoring wrong type: %d\n",type);
                obj=null;
                break;
        }
        return obj;
    }

    public static void main(String args[])
    {
        Shapes shapes[] = new Shapes[50];
        int n,i=0,sheetType;
        Shapes s;
        Scanner sc =  new Scanner(System.in);
        while(sc.hasNextInt())
        {
            sheetType = sc.nextInt();
            s=createShape(sheetType,sc);
            if(sheetType==-1)
                break;
            if(s!=null)
            {
                if(i>=shapes.length)
                {
                    System.out.println("Shape limit reached");
                    break;
                }
                shapes[i++]=s;
            }
                
        }
        n=i-1;
        for(i=0;i<=n;i++)
        {
            System.out.print(i+":");
            shapes[i].displayShape();
        }
    }

}