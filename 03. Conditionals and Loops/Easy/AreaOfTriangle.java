package com.karan.LoopsConditionals;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the area of a triangle using user input height and base length : ");
        String s = "(1 / 2) * base * height";
        System.out.println("Formula to find the area of a triangle is : " + s);
        System.out.println("Enter base length of the triangle : ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle : ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle with \nbase length = " + base + " units" +
                "\nheight = " + height + " units \n= " + area + " sq. units");
    }
}
