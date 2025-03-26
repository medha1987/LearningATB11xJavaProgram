package ex_010_Strings;

public class String_Fun_lower_upper_Case_len_concat {

    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        String s1 = "ABCD";
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));
        System.out.println(s1);
    }
}

