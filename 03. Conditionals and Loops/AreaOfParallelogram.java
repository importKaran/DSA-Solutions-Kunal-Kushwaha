package com.karan.LoopsConditionals;

import java.util.Scanner;

public class AreaOfParallelogram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the area of a Parallelogram using user input base and height : ");
        String s = "base * height";
        System.out.println("Formula to find area of rectangle = " + s);
        System.out.println("Enter the base of the parallelogram : ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the parallelogram : ");
        double height = sc.nextDouble();
        double area = base * height;
        System.out.println("Area of the parallelogram with \nbase = " + base + " units\n" +
                "width = " + height + " units\n= " + area + " sq. units");
    }
}
