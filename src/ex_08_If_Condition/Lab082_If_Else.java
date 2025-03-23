package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your age");
        int age= scanner.nextInt();
        System.out.println(age);

        if(age>18) {

        System.out.println("allowed to vote");
        }
        else {
            System.out.println("not allowed");
        }
    }
}
