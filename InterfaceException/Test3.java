import java.util.*;
public class Test3
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,i,num,sum=0;
        String input;
        try{
            n=sc.nextInt();
            for(i=0;i<n;i++)
            {
                num=sc.nextInt();
                sum += num;
            }
            System.out.println(sum);
        }
        catch(InputMismatchException e)
        {
            input = sc.nextLine();
            System.out.println("ERROR");
        }
        sc.close();
    }
}