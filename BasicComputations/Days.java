import java.util.*;
public class Days{
    public static void main(String args[])
    {
        int n;
        String day="";
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n!=0)
        {
            switch(n)
            {
                case 1: day="Monday";
                    break;
                case 2: day="Tuesday";
                    break;
                case 3:day="Wednesday";
                    break;
                case 4:day="Thursday";
                    break;
                case 5:day="Friday";
                    break;
                case 6:day="Saturday";
                    break;
                case 7:day="Sunday";
                    break;
                default:day="ERROR";
            }
            System.out.println(day);
            n=sc.nextInt();
        }
    }
}