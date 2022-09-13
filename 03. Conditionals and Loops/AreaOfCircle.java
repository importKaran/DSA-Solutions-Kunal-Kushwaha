package com.karan.LoopsConditionals;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find area of a circle using user input radius : ");
        char c = '\u03C0';  // symbol for pi
        String s = c + " * (r ^ 2)";
        System.out.println("Formula to find area of circle = " + s);
        System.out.println("Enter the radius of the circle : ");
        double rad = sc.nextDouble();
        double area = Math.PI * (rad) * (rad);
        System.out.println("The area of circle with \nradius = " + rad + " units \n= " + area + " sq. units");
    }
}
