import java.util.*;
public class Test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        Rectangle r = new Rectangle(a,b);
        System.out.println(r.computeArea());
    }
}