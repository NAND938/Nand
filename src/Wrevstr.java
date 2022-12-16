public class Wrevstr
{
    public static void main(String[] args) {
        int n=107,c=0;
        n=n/2;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c=1;
            }
        }
        if(c==0)
        {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
