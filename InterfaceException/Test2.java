import java.util.*;
public class Test2
{
    public static void main(String args[])
    {
        try{
            int num=-10;
            if(num<0)
            {
                throw new MyException("Number cannot be negative");
            }
            System.out.println("Number is positive: "+num);
        }
        catch(MyException e)
        {
            System.out.println("Caught a custom exception: "+e.getMessage());
        }
    }
}