package Day_Task;

public class Day14_CLi_maxof2numbers {
    public static void main(String[] args) {
        //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
       String num1= args[0];
       String num2= args[1];
       int Num1=Integer.parseInt(num1);
       int Num2=Integer.parseInt(num2);
        System.out.println("first number is "+Num1);
        System.out.println( "second number is "+Num2);


       String maxnum= (Num1>Num2)?"Num1 is max":"Num2 is max";
        System.out.println(maxnum);
    }
}
