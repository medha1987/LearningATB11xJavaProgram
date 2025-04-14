package Ex30_Exceptions;

public class Lab011_trycatch_finally {
    public static void main(String[] args) {
        int a =1;
        int c = 0;
        try {
            c = 10/2;
            //c=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I will be always executed!");
        }

    }
}
