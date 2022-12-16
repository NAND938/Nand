import java.util.Scanner;

public class WordReverse
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Eneter a line");
        String line=obj.nextLine();
        String rev[]=line.split(" ");
        for(int i=rev.length-1;i>=0;i--)
        {
            System.out.print(" "+rev[i]);
        }
    }
}
