package ex_010_Strings;

public class StringBufferFunctions {
    public static void main(String[] args) {
    StringBuffer sb1= new StringBuffer("hello");
        System.out.println(sb1);


        sb1.append(" i am medha");
        System.out.println(sb1);

        sb1.insert(6,"there! ");
        System.out.println(sb1);
       // sb1.reverse();
       // System.out.println(sb1);
        System.out.println(sb1.capacity());
        String sb1toS = sb1.toString();//since we converted to String ,it is nolonger mutable unless we reassign
        sb1toS= sb1toS.toUpperCase();

        System.out.println(sb1toS);

    }



}
