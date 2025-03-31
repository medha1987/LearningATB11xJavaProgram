package Arrays;

public class Array_Odd_Even_numbers {

    public static void main(String[] args) {
        int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] evenno = new int[10];
        int[] oddno = new int[10];
        // System.out.println(numbers.length);
        // int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
          //  else {
           // oddno= numbers[i];
          //  }
        }

    }
}
