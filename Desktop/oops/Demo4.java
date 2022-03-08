class MyChildFour extends Thread
{
    String name;

    MyChildFour(String name)
    {
        super(name);

    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
 
public class Demo4 {
 
    public static void main(String[] args) {

        MyChildFour mf = new MyChildFour("MyChild");
        mf.start();

        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
 
    }
 
}