package ex_010_Strings;

public class StringBuilder_function {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append(123);
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        sb.reverse();// no need of reassignment ,string is mutable
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Java");
        sb1.append(" Programming");
        System.out.println(sb1);
        sb1.delete(5,16); // Delete the substring
        System.out.println(sb1);
        sb1.replace(0, 4, "C++");
        System.out.println(sb1);
    }
}
