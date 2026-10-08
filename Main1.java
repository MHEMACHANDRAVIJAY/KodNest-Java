class Parent {
    void display1()
    {
        System.out.println("Inside Parent display1");
    }
    void display2()
    {
        System.out.println("Inside Parent display2");
    }
}

class Child1 extends Parent
{
    @Override
    void display2()
    {
        System.out.println("Inside Child1 display2");
    }
    void display3()
    {
        System.out.println("Inside Child1 display3");
    }
}

class Child2 extends Parent
{
    @Override
    void display2()
    {
        System.out.println("Inside Child2 display2");
    }

    void display3()
    {
        System.out.println("Inside Child2 display3");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Parent p = new Child1();
        p.display1();
        p.display2();
        ((Child1)(p)).display3();// downcasting
    }
}