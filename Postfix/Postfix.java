import java.util.*;
public class Postfix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String exp=sc.nextLine();
        String post[]=exp.split(" ");
        Stack s = new Stack();
        for(String token:post)
        {
            int val1=0,val2=0,result;
            switch(token)
            {
                case "+":
                    if(!s.isEmpty())
                        val1=s.pop();
                    if(!s.isEmpty())
                        val2=s.pop();
                    s.push(val1+val2);
                    break;
                case "-":
                    if(!s.isEmpty())
                        val1=s.pop();
                    if(!s.isEmpty())
                        val2=s.pop();
                    s.push(val2-val1);
                    break;
                case "*":
                    if(!s.isEmpty())
                        val1=s.pop();
                    if(!s.isEmpty())
                        val2=s.pop();
                    s.push(val1*val2);
                    break;
                case "/":
                    if(!s.isEmpty())
                        val1=s.pop();
                    if(!s.isEmpty())
                        val2=s.pop();
                    s.push(val2/val1);
                    break;
                default:
                    s.push(Integer.parseInt(token));
            }
        }
        System.out.println(s.pop());
    }
}