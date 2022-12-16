public class PrimeNumber
{
    public static void main(String[] args)
    {
        int m,f=0,n=190;
        m=n/2;
        for(int i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                System.out.println("no is not prime");
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("no is prime");
        }
    }
}
