import java.util.*;
public class TestRunnable1
{
    public static void main(String args[])
    {
        int arr[] = new int[10];
        int i=0;
        Scanner sc  = new Scanner(System.in);
        while(sc.hasNextInt())
        {
            arr[i++]=sc.nextInt();
        }
        MyThread1 mt1 = new MyThread1("C1",arr);
        MyThread1 mt2 = new MyThread1("C2",arr);
        try
        {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException ex)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println(mt1.thrd.getName()+":"+mt1.getSum());
        System.out.println(mt2.thrd.getName()+":"+mt2.getSum());
    }
}