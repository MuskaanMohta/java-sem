import java.util.*;
public class Reverse
{
    public static void main(String args[])
    {
        String s;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        int l=0,n=0,o=0,s1=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            //s.charAt(i);
            System.out.print(s.charAt(i));
        }
        System.out.println();
        String words[] = s.split(" ");
        System.out.println(words[words.length-2]);
        char ch[] = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(ch[i]))
                l++;
            else if(Character.isDigit(ch[i]))
                n++;
            else if(Character.isSpaceChar(ch[i]))
                s1++;
            else
                o++;
        }
        System.out.println(l);
        System.out.println(n);
        System.out.println(s1);
        System.out.println(o);
    }
}