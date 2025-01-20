import java.util.*;
public class Prime{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1)
        {
            System.out.printf("%d is not prime",n);
        }
        else if (n==2||n==3||n==5||n==7)
        {
            System.out.printf("%d is prime",n);
        }
        else{
            int c=0;
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    c++;
                    break;
                }
            }
            if(c==0)
                System.out.printf("%d is Prime",n);
            else
                System.out.printf("%d is not Prime",n);
        }
    }
}