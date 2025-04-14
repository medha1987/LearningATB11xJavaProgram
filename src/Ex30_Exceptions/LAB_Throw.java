package Ex30_Exceptions;

public class LAB_Throw {
    public static void main(String[] args) {

    }

    static void divideByZero(int a ){
        // check some
        if (a == 0)
        {
            throw new ArithmeticException(); // i played game i did wrong so you are surrendering
            //you are creating exception and not JVM
        }
    }
}
