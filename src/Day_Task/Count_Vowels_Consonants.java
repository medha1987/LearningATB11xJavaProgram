package Day_Task;

import java.util.Scanner;

public class Count_Vowels_Consonants {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine().toLowerCase();

        int vowel=0;
        int conson=0;
        int i=0;
        for ( i=0;i<name.length();i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
           if (ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u' )
            {
                vowel=vowel+1;
            }
           else {
               conson++;
           }
        }
        System.out.println("no of vowels in string"+vowel);
        System.out.println("no of consonants in string"+conson);
        }
    }


