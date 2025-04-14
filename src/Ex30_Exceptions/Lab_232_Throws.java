package Ex30_Exceptions;

import java.io.File;
import java.io.FileInputStream;

public class Lab_232_Throws {
    public static void main(String[] args) throws Exception {  //used exception because more than 1 exception
        //instead of just writing fileNotFoundException ,we write parent one
        //throws publicly announced it will handle it ie givign tight slap in public
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
        String s1 = null;
        s1.trim();
        int a = 10/0;
        File file = new File("");

    }

    static void t() throws Exception{   //whichever method can have exception we can mention throws for it
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}
