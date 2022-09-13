package com.karan.LoopsConditionals;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the perimeter of an Equilateral triangle using user input length of one" +
                " side which is equal for all sides : ");
        String s = "3 * a";
        System.out.println("Formula to find the perimeter of an Equilateral triangle is : " + s);

        System.out.println("Enter the length of one side of Equilateral triangle : ");
        double a = sc.nextDouble();
        double perimeter = 3 * a;

        System.out.println("Perimeter of the Equilateral triangle with \nAll side same length = " + a + " units" +
                "\n= " + perimeter + " units");
    }
}
