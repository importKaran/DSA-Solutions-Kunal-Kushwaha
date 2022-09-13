package com.karan.LoopsConditionals;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the area of a Isosceles triangle using user input same side length and " +
                "remaining side length : ");
        char c = '\u221A';
        String s = "(b / 4) * " + c + "[4 * (a ^ 2) - (b ^ 2)]";
        System.out.println("Formula to find the area of a triangle is : " + s);

        System.out.println("Enter length of the same side of Isosceles triangle : ");
        double a = sc.nextDouble();
        System.out.println("Enter the length of the remaining side of Isosceles Triangle : ");
        double b = sc.nextDouble();

        double temp = (4 * (a * a)) - (b * b);
        double area = (b / 4) * Math.sqrt(temp);

        System.out.println("Area of the triangle with \nsame side length = " + a + " units" +
                "\nremaining side length = " + b + " units \n= " + area + " sq. units");
    }
}
