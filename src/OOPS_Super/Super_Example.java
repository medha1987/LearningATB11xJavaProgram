package OOPS_Super;

public class Super_Example {
    public static void main(String[] args) {
        Dog d1= new Dog();//it calls its parent constructor as well as its own constructor
        d1.display();
    }
}

class GOD{
    void sound(){
        System.out.println("God!");
    }
}

class Animal extends GOD{
    protected  String color  = "white";

Animal(){
   System.out.println("this is animal constructor");
}

    void sound(){
        System.out.println("Animal Sound!");
        super.sound();
    }

}

class Dog extends Animal{

    private String color  = "Black";

    Dog(){
      //  System.out.println("print");
        //super();
    }

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }

}