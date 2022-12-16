import java.util.Scanner;
public class Hello
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter any year");
        int y=ob.nextInt();
        if(y%100==0)
        {
            if(y%400==0)
            {
                System.out.println("Year is leap year");
            }
            else
            {
                System.out.println("year is not leap year");
            }

        }
        else if (y%4==0)
        {
            System.out.println("Year is leap year");
        }
        else {
            System.out.println("year ia not leap year");
        }
    }
}
