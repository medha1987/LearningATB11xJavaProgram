package Ex30_Exceptions;

import java.io.FileInputStream;

public class Lab002_checked_exception {
    public static void main(String[] args) {

        // Checked Exception
      //FileInputStream fileInputStream = new FileInputStream("C://testdata.txt"); //file not found exception
        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.
        //

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.
    }
}
