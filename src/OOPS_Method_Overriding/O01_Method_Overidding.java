package OOPS_Method_Overriding;

public class O01_Method_Overidding {
    public static void main(String[] args) {
        Dog d1  = new Dog();
        d1.sound();
    }


}

class Animal{
    void sound(){
        System.out.println("Animal Sound!");
    }
}

class Dog extends Animal{
    @Override
     void sound(){
        System.out.println("Bark!");
      //return("bark");
    }

}
