import java.util.*;
public class Test1
{
    public static void main(String args[])
    {
        int num=0;
        String input;
        Scanner sc = new Scanner(System.in);
        try
        {
            num=sc.nextInt();
            System.out.println("Entered num:"+num);
        }
        catch(InputMismatchException e)
        {
            input=sc.nextLine();
            System.out.println(input+": Not a number");
        }
    }
}