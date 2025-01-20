import java.util.*;
import java.util.Arrays;
public class Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[50];
        int i=0,size=0;
        System.out.println("Enter numbers to sort (press any non-number key to finish):");
        while(sc.hasNextDouble())
        {
            arr[i++]=sc.nextDouble();
        }
        size=i;
        Arrays.sort(arr,0,size);
        for(int j=0;j<size;j++)
            System.out.printf("%.2f ",arr[j]); 
        sc.close();
    }
}