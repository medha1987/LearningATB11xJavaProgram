package Ex30_Exceptions;

import java.util.Scanner;

public class Lab_Throw_example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
//condition for going to GOA
    private static void validateAge(int age) throws ArithmeticException,NullPointerException,Exception {
        if(age < 18){
            throw new Exception("You can't go, else you will be out of the house");
            // throw new NotValidAgeException("Not a Valid age");
        }

    }
}
