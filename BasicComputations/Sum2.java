import java.util.*;
public class Sum2{
    public static int sum(int n)
    {
        int d,s=0;
        while(n!=0)
        {
            d=n%10;
            s+=d;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        int s,s1=0;
        for(int i=1;i<=n;i++)
        {
            int num = sc.nextInt();
            s=sum(num);
            s1 += s;
        }
        System.out.println(s1);

    }
}