import java.util.*;
public class RangePrime {
    public static void main(String args[])
    {
        Prime1 p = new Prime1();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter starting and ending nos of the range: ");
        int n= sc.nextInt();
        int m= sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            p.isPrime(i);
        }

    }
}