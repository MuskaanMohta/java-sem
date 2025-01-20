import java.util.*;
public class Find
{
    public static boolean find(int arr[],int key)
    {
        int i,f=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                f=1;
                break;
            }
        }
        if(f==1)
            return true;
        else
            return false;
    }
    public  static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int nums[] = new int[50];
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        int i=0;
        while(sc.hasNextInt())
            nums[i++]=sc.nextInt();
        
        if(find(nums,key))
            System.out.println("Found");
        else    
            System.out.println("Missing");
    }
}