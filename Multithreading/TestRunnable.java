import java.util.*;
public class TestRunnable
{
    public static void main(String args[])
    {
        
        System.out.println("Main Thread: Started");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyThread mt = new MyThread("Factorial",n);
        Thread nt = new Thread(mt);
        nt.start();
        System.out.println("Main Thread: Ended");

    }
}