package Day_Task;

public class Day14_CLI_Ops {
    // CLI Options
    //Take a user input - Name, Age and Salary and print them in the end.
    //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

    public static void main(String[] args) {
        String name=args[0];
        String age=args[1];
        String salary=args[2];
        String age1=args[3];

        System.out.println(name);
        System.out.println(age);
        System.out.println(age1+age);
        System.out.println(salary);
        int Age=Integer.parseInt(age);
        int Age1=Integer.parseInt(age1);
        int Salary1=Integer.parseInt(salary);
        System.out.println(name);
        System.out.println(Age);
        System.out.println(Age1);
        System.out.println(Age1+Age);
        System.out.println(Salary1);




    }



}
