class Prime1{
    
    public void isPrime(int n)
    {
        //if(n<=1)
        //{
          //  System.out.printf("%d is not prime\n",n);
        //}
        if (n==2||n==3||n==5||n==7)
        {
            System.out.print(n+" ");
        }
        else{
            int c=0;
            if(n!=1){
                for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    c++;
                    break;
                }
            }
            if(c==0)
                System.out.print(n+" ");
            
            }
            
        }
    }
    
}