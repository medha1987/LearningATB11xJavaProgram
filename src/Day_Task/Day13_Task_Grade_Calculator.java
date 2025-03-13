package Day_Task;

public class Day13_Task_Grade_Calculator {
    /**
    Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
     A: 90-100  B: 80-89    C: 70-79    D: 60-69    F: 0-59**/
    public static void main(String[] args) {
        String sc=args[0];
        System.out.println(sc);
        int score=Integer.parseInt(sc);
/*condition ? expression1 : expression2
 // int score =92; */

       String result =  score>=90 ? "your grade is A" :(score>=80 && score<90)? "your Grade is B":
               (score>=70 && score<80)? "your grade is C" :(score>=60 && score<69)? "your grade is D":
                       "your grade is F";
        System.out.println(result);


    }

}
