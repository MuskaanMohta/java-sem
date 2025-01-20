import java.util.*;
public class Sum{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d,s=0;
        if(n<0)
        {
            n=n*(-1);
        }
        while(n!=0)
        {
            d=n%10;
            s+=d;
            n/=10;
        }
        System.out.println("Sum of digits is "+s);

        
    }
}