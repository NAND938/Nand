public class Main
{
    public static void main(String [] args)
    {
      String s1="Nand Kishor Singh",temp="";
      String rev[]=s1.split(" ");
      for(int i=rev.length-1;i>=0;i--)
      {
          temp=" "+rev[i];
      }
        System.out.println(temp);
    }
}