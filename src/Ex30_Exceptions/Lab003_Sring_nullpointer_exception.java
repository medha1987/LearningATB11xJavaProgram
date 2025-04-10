package Ex30_Exceptions;

public class Lab003_Sring_nullpointer_exception {

    public static void main(String[] args) {
        String name= null;
        name.trim(); // java.lang.NullPointerException
    }



}
