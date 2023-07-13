public class May24
{
    int a = 10; // global variable
    static int b = 30; // static variable
    public void display()
    {
        int a = 20; // local variable
        System.out.println("Local Variable:\t\t" + a);
    }
    public static void main(String args[])
    {
        May24 m = new May24();
        System.out.println("GLOBAL AND STATIC VARIABLES");
        System.out.println("***************************");
        System.out.println("Global Variable:\t" + m.a);
        m.display();
        System.out.println("Static Variable:\t" + b);
    }
}