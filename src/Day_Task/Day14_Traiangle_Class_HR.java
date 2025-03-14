package Day_Task;

import java.util.Scanner;

public class Day14_Traiangle_Class_HR {
    public static void main(String[] args) {

        // ✅ Triangle Classifier:
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),isosceles (exactly two sides are equal),
        // or scalene (no sides are equal). Use an if-else statement to classify the triangle.

        Scanner scan= new Scanner(System.in);
        float side1=scan.nextFloat();
        float side2=scan.nextFloat();
        float side3=scan.nextFloat();

        if((side1==side2)&&(side2==side3))
        {
            System.out.println("Triangle is eqilateral");
        } else if ((side1==side2)||(side2==side3||(side1==side3))) {
            System.out.println("Triangle is Isosceles");}
            else
            System.out.println("Triangle is scalene");

        }



}
