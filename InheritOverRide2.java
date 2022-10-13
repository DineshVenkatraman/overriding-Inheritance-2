class A
{
    void display()
    {
        System.out.println("A is display");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("b is display-method overriding");
    }
}
class C extends A
{
    void display()
    {
        System.out.println("c is display-method overriding");
    }
}



public class InheritOverRide2 {
    public static void main(String args[])
    {
        A a=new A();
        a.display();
        a=new B();
        a.display();
        a=new C();
        a.display();
        // A c=new A();
        // c.display();
    }
}
