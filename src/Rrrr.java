public class Rrrr
{
    public static void main(String[] args) {
        String s="nand Kishor singh";
        String r[]=s.split(" ");
        for(int i=r.length-1;i>=0;i--)
        {
            s=r[i]+" ";
            System.out.println(s);
        }

    }
}
