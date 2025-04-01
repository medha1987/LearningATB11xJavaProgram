package Constructors;

public class Person {

    String name ;
    int age;
    String address;
    long phone_no;
    boolean isMale;

    public static void main(String[] args) {
    Person p1=new Person();
    Person p2=new Person("pankaj",30,true);
    System.out.println(p2.name);
    System.out.println(p2.isMale);
    Person p3=new Person(54654657,"lake town");
    System.out.println(p3.phone_no);
    System.out.println(p3.address);
    p2.eat("kiran");
    p1.Walk("medha");
    }


    //Default constructor
    Person(){
    name="Rahul";
    age=30;
    isMale=true;
        System.out.println("from default constructor"+name);
        System.out.println("from default constructor"+age);
    }
    Person(String name,int age,boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale=false;
    }
    Person(long phone_no,String address)
    {
        this.phone_no=7787646;
        this.address="India";
    }
    void eat(String name){
        System.out.println(name+"likes to eat all type of food");
    }
    void Sleep(String name){
        System.out.println(name+"likes to sleep over weekends");
    }
    void Walk(String name){
        System.out.println(name+"likes to take a walk on green garden");
    }
    void Dohome(){
        System.out.println("all should do their own homework");
    }
    String PrintDetails(String name,byte age,long phone){
        return (name+"of"+age+"has this"+phone);

    }
}

