package com.karan.LoopsConditionals;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the area of an Equilateral triangle using user input length of one " +
                "side which is equal for all sides : ");
        char c = '\u221A';  // symbol for square root
        String s = c + "(3) / 4 * (a ^ 2)";
        System.out.println("Formula to find the area of an Equilateral triangle is : " + s);

        System.out.println("Enter the length of one side of Equilateral triangle : ");
        double a = sc.nextDouble();

        double temp = Math.sqrt(3);
        double area = temp / 4 * (a * a);

        System.out.println("Area of the Equilateral triangle with \nAll side same length = " + a + " units" +
                "\n= " + area + " sq. units");
    }
}
