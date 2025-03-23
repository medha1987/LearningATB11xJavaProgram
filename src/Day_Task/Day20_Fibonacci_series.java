package Day_Task;

public class Day20_Fibonacci_series {

    public static void main(String[] args) {

       int n=10;
       int First = 0;
       int Second = 1;


        for(int i=0;i<n;i++)
        {   System.out.print(First + " ");
            int series=First+Second;
           First=Second;
           Second=series;

        }



    }
}
