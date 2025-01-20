import java.util.*;
public class PalindromeTest{
    public static void main (String args[])
    {
        Palindrome p = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n = sc.nextInt();
        int m= sc.nextInt();
        int s=0,sum;
        for(int i=n;i<=m;i++)
        {
            sum=p.palindrome(i);
            s += sum;
        } 
        System.out.println("Sum is "+s);        
        
    }
}