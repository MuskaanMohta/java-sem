class MyThread1 implements Runnable
{
    Thread thrd;
    int result;
    int list[];
    private int sum;
    MyThread1(String name,int nums[])
    {
        thrd=new Thread(this,name);
        list=nums;
        thrd.start();
    }
    public void run()
    {
        int i,sum=0;
        for(i=0;i<list.length;i++)
        {
            sum += list[i];

        }
        result = sum;
    }
    public int getSum()
    {
        return result;
    }
}