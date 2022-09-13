package com.karan.LoopsConditionals;

import java.util.Scanner;

public class PerimeterOfParallelogram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the perimeter of a Parallelogram using user input length and width : ");
        String s = "2 * (length + width)";
        System.out.println("Formula to find perimeter of rectangle = " + s);
        System.out.println("Enter the length of the parallelogram : ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the parallelogram : ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the parallelogram with \nlength = " + length + " units\n" +
                "width = " + width + " units\n= " + perimeter + " units");
    }
}
