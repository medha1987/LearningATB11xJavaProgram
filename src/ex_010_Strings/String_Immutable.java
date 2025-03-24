package ex_010_Strings;

public class String_Immutable {
    public static void main(String[] args) {
        String name = "medha";
        name.toUpperCase();
        System.out.println(name);
        name=name.toUpperCase();//unless you assign it again it will not change
        System.out.println(name);
    }
}
