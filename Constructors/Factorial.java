class Factorial{
    int num;
    Factorial(int n){
        num=n;
    }
    long fact(){
        
        if(num<0)
        {
            System.out.println("ERROR");
            return -1;
        }
        else if(num==0)
        {
            return 1;
        }
        else{
            long f=1;
            for(int i=1;i<=num;i++)
            {
                f *=i;
            }
            return f;
        }

    }
}