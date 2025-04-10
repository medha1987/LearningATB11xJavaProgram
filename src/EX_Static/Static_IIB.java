package EX_Static;

public class Static_IIB {

        public static void main(String[] args) {
            P p1 = new P();
            P p2 = new P();
            P p3 = new P();

            // IIB -> 3 -> Objects
            // SIB -> 1 -> Class
        }

    }

    class P{
        int a=10;
        static {
            System.out.println("SIB");

        }

        {
            System.out.println("IIB");

        }
        P(){
            System.out.println("DC");
        }



    }

