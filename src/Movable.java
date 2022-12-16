interface Movable
{
    void dis1();
}
interface Students
{
    void dis2();
}
class College implements Movable, Students
{
    public void dis1()
    {
        System.out.println("I am a teacher");;;;
    }
    public void dis2()
    {
        System.out.println("i am a student");
    }
}
class CollegeData
{
    public static void main(String[] args)
    {
        College obj=new College();
        obj.dis1();
        obj.dis2();
    }
}
