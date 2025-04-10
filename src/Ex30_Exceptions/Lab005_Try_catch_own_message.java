package Ex30_Exceptions;

public class Lab005_Try_catch_own_message {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (Exception e){
            System.out.println("ARE YOU FOOL. DIV BY ZERO?");
        }
        System.out.println("2");




    }

}
