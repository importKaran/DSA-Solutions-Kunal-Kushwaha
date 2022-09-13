package com.karan.LoopsConditionals;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the area of a rectangle using user input length and width : ");
        String s = "length * width";
        System.out.println("Formula to find area of rectangle = " + s);
        System.out.println("Enter the length of the rectangle : ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle : ");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("Area of the rectangle with \nlength = " + length + " units\n" +
                "width = " + width + " units\n= " + area + " sq. units");
    }
}
