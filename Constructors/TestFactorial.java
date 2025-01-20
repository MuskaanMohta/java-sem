import java.util.*;
public class TestFactorial
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial fact = new Factorial(n);
        long f = fact.fact();
        System.out.println(f);
    }
}