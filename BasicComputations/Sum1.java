import java.util.*;
public class Sum1{
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
        int n = sc.nextInt();
        int j,s=0,i;
        for(i=1;i<=n;i++)
        {
            j=sum(i);
            s+=j;
        }
        System.out.println(s);
        }

}