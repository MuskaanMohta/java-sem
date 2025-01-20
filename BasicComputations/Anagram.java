import java.util.*;
public class Anagram
{
    public static void main(String args[])
    {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        s = s.toLowerCase();
        int i,j,c=0;
        String rev = "";
        for(i=s.length()-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

}