 class Palindrome{
    public int palindrome(int n)
    {
        int d,r=0;
        int m=n;
        while (n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;

        }
        if(r==m)
        {
            int s=0,d1; 
            while(m!=0){
                d1=m%10;
                s=s+d1;
                m=m/10;
            }
            return s;
        }
        else
            return 0;
    }
 }