package ex_010_Strings;

public class String_fun_IndexOf {
    public static void main(String[] args) {

     /*   String s1="Madam";
        int i= s1.indexOf("d");
        System.out.println(i);*/

      /*  String s3="Hello World";
        String Sub=s3.substring(6,11);
        System.out.println(Sub);*/

        String s2="Showing 1 to 10 of 19081(1300 pages)";
        int start_index=s2.indexOf("(")+1;
        System.out.println(start_index);
        int end_index= s2.indexOf("pages")-1;
        System.out.println(end_index);
        String sub=s2.substring(start_index,end_index);
        System.out.println(sub);
        int sub1=Integer.parseInt(sub);
        System.out.println("total no of page are: " +sub1);
    }
}
