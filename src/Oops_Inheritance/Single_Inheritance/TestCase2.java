package Oops_Inheritance.Single_Inheritance;

public class TestCase2 extends CommonToAll {
    void runningTC2(){
        startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}

