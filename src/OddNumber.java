import java.util.Scanner;

public class OddNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=obj.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.print(a*i +" ");
        }
    }
}
