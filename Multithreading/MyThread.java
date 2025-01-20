
class MyThread implements Runnable
{
    String fact;
    int num;
    MyThread(String fact,int num)
    {
        this.fact=fact;
        this.num=num;
    }
    public void run()
    {
        System.out.println("Factorial Thread: Started");
        int f=1,i;
        if(num<0)
        {
            System.out.println("Factorial Thread: ERROR");
        }
        else
        {
            for(i=1;i<=num;i++)
            {
                f = f*i;
            }
            System.out.println("Factorial Thread: "+f);
        }
        System.out.println("Factorial Thread: Ended");
        
    }
}