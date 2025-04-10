 package Ex29_Wrapper_Class;

public class  Lab004_WrapperConversion_Part2 {

    public static void main(String[] args) {
        String num  = "10";
        int aaa = 10;

        // String -> Wrapper -> parseX()  ,   Integer.parseInt(num);Double.parseDouble()
        Integer a  = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);
        System.out.println(b);
        Integer c=a+b;
        System.out.println(c);
        // String to Primitive
        int aa = Integer.parseInt(num);

        // String to Wrapper


        // Wrapper to String (toString method)
       String w1 = a.toString();
        System.out.println(w1);


        // Primitive to String
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());
        System.out.println(c+w1);










    }
}
