package Ex29_Wrapper_Class;

public class Lab001_Primitive_wrapper {

    public static void main(String[] args) {
        int a = 10; // primitive
        // This is not Object
        // It will not have attribute or Behaviour

        // char, short, byte, long, float, double, - we will avoid them now


        // We will use the Wrapper classes,
        // Character, Boolean, Short, Long, Double, Float

        Integer age = 65;
        String name="medha";
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
        System.out.println(String.valueOf(name));
        System.out.println(name);

    }
}