package Oops_Inheritance.Single_Inheritance;

public class inheritance_single{
    public static void main(String[] args) {
        TestCase1 t1=new TestCase1();

        t1.startBrowser();
        t1.readDataBaseFile();
        t1.runningTC1();

        TestCase2 t2=new TestCase2();
        System.out.println("--------");
        t2.startBrowser();
        t2.readExcelFile();
        t2.closeBrowser();

    }
    
}
