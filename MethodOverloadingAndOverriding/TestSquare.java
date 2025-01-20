import java.util.*;
public class TestSquare{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        double num = sc.nextDouble();
        Square s = new Square ();
        System.out.printf("Square of %d is %d\n",n,s.sq(n));
        System.out.printf("Square of %.2f is %.2f",num,s.sq(num));
    }
}