package OOPS_Method_Overloading;

public class Poly_MethodOverloading {
   static class MathOperations {
        int add(int a, int b) {
            return a + b;
        }
        int add(int a, int b, int c) {
            return a + b + c;
        }
        double add(double a, double b) {
            return a + b;
        }

        String add(String a, String b) {
            return a + b;
        }

    }
    public static void main(String[] args) {
        MathOperations mop = new MathOperations();
        int m1= mop.add(2,3);
        System.out.println(m1);

    }
}
