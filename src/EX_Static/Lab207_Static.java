package EX_Static;

public class Lab207_Static {
    public static void main(String[] args) {
        B.commonToAll(); // static method and variables can be accessed without creating objects
        System.out.println(B.b);
      //  System.out.println(B.a);//a is non static variable
        System.out.println("----");
        B b_ref = new B();
        b_ref.display();
        System.out.println(b_ref.a);
    }
}

class B{
    static {
        System.out.println("SIB, called once, class is loaded");
    }
    int a = 30;
    static int b = 10;

    void display(){
        System.out.println(b);
        System.out.println(a);
        System.out.println("Non static F(n)");
    }
    static void commonToAll(){
//        System.out.println(a); static method cannot accessed non static variable
        System.out.println("Static F(n)");
    }

//    static class C{
//        // Not useful
//    }
}


