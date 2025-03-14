package Day_Task;

public class Day14_In_De_Op2 {

    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        /*
        --a = 19  --->> a=19
        a++=19 ----->> a=20
        a--=20--->>a=19
        a=58
         */

    }
}
