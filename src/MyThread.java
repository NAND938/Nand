class MyThread implements Runnable
{
    Thread t;
    MyThread()
    {
        t=new Thread(this);
    }
    public void run()
    {
        System.out.println("Thread is running");
    }
}
class Test
{
    public static void main(String as[])
    {
        MyThread t1=new MyThread();
        t1.run();
    }
}
