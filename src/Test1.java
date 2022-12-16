class A
{
    void add1()
    {
        int a=4,b=5,c=a+b;
        System.out.println(c);
    }
    void add1(int a)
    {
        System.out.println(a*a);
    }
    void add1(String s)
    {
        System.out.println(s);
    }
}
public class Test1
{

    public static void main(String[] args)
    {
        A obj=new A();
        obj.add1();
        obj.add1(5);
        obj.add1("Nand");
    }
}
