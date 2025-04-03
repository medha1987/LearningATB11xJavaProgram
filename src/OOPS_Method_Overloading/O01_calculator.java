package OOPS_Method_Overloading;

public class O01_calculator {
        int add(int a, int b) {
           // System.out.println("integer add");
            return (a + b);

        }

        double add(double a, double b) {
            //System.out.println("Double add");
            return (a + b);
        }

        public static void main(String[] args) {
            O01_calculator c1 = new O01_calculator();
            System.out.println(c1.add(3, 4));
            System.out.println(c1.add(3.414, 4.56));
        }
    }

