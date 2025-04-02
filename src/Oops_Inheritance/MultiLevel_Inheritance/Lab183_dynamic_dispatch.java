package Oops_Inheritance.MultiLevel_Inheritance;

public class Lab183_dynamic_dispatch {
    public static void main(String[] args) {
           // Son s1=new GrandFather();//not allowed
           // Son s1 = new Father();//not allowed
    Son ajay=new Son();
    GrandFather g1=new Son();//Dynamic dispatch
    g1.gf();
    System.out.println(g1.gold_gf);

    Father f1=new Son();
        System.out.println("---calling method from son---");
                f1.home();
    //Father f3 = new GrandFather();//not allowe
        GrandFather g2 = new Father();
        g2.gf();
        Father g3=(Father)g2; //typecasting
        g3.f();





    }
}
