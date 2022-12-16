public class ReverseString
{
    public static void main(String[] args) {
        String s1="nand", temp="";
        char ch;
        for(int i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            temp=ch+temp;
        }
        if(s1.equals(temp))
        {
            System.out.println(s1+ " is pallin");
        }
        else {
            System.out.println(s1+" is not pallin");
        }
    }
}
