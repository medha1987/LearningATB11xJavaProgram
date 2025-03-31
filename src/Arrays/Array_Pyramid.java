package Arrays;

public class Array_Pyramid {
    public static void main(String[] args) {
        int rows = 3; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}