import java.util.*;
public class SimpleStack
{
    public static void main(String args[])
    {
        String st[] = new String[5];
        GenSimpleStack<String> arr=new GenSimpleStack<String>(st);
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int ch=sc.nextInt();
            switch(ch)
            {
                
                case 1:
                    try
                    {
                        String item=sc.next();
                        arr.push(item);
                    }
                    catch(StackFullException ex)
                    {
                        System.out.print(ex);
                    }
                    break;
                case 2:
                    try{
                        String item = arr.pop();
                        System.out.print(item+" ");
                    }
                    catch(StackEmptyException ex)
                    {
                        System.out.print(ex);
                    }
                    break;
                case 0:System.exit(0);
                default:System.out.print("Invalid Choice\n");
            }

        }
    }
}