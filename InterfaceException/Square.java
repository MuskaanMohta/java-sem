import java.util.*;
public class Square
{
    public static void main(String args[])
    {
        Test t = new Test();
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        //int sq=t.findSqrt(num);
        System.out.println(t.findSqrt(num));
    }
}