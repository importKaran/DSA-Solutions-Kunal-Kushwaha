package com.karan.LoopsConditionals;

import java.util.Scanner;

public class PerimeterOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find perimeter of a circle using user input radius : ");
        char c = '\u03C0';  // symbol for pi
        String s = "2 * " + c + " * r";
        System.out.println("Formula to find perimeter of circle = " + s);
        System.out.println("Enter the radius of the circle : ");
        double rad = sc.nextDouble();
        double perimeter = 2 * Math.PI * (rad);
        System.out.println("The perimeter of circle with \nradius = " + rad + " units \n= " + perimeter + " units");
    }
}
