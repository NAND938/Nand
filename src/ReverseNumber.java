public class ReverseNumber
{
    public static void main(String[] args) {
        String s1="Nand Kishor";
        String temp[]=s1.split(" ");
        for(int i=temp.length-1;i>=0;i--)
        {
            System.out.print(" "+temp[i]);
        }

    }
}
