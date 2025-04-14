package Ex30_Exceptions;

public class Lab010_trycatch_IQ4 {
    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            b = 10/c; // Vulnerable Code that should be try and catch!
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
