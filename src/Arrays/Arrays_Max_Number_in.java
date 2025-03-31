package Arrays;

public class Arrays_Max_Number_in {
    public static void main(String[] args) {
       /* int[] numbers={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println(numbers.length);
        int i=0;
        int max = numbers[0];

        for(i=1;i<numbers.length;i++)
        {
            if(max<numbers[i]) {
            max=numbers[i];
            }

        }
        System.out.println("largest no "+ max);
        int sec_max= 0;



        for(int j=0;j<numbers.length;j++)
        {
            if(numbers[j]>sec_max && (sec_max!=max))
            {
                sec_max=numbers[j];

            }
        }
        System.out.println("second largest number"+sec_max);*/
        int numbers[]={20,98,78,97,67,57,98};

        int max1 = 0;
        int max2 = 0;

        for(int i=0; i< numbers.length ; i++){

            if(numbers[i]>max1){
                max2 = max1;
                max1 = numbers[i];
            }
            else if (numbers[i]>max2 && numbers[i]!=max1) {
                max2=numbers[i];
            }

        }
        System.out.println("First largest number is: " +max1);
        System.out.println("Second largest number is: " +max2);



    }
}
