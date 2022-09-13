package com.karan.LoopsConditionals;

import java.util.Scanner;

public class VolumeOfRectangularPrism {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the volume of rectangular prism using user input length, width and " +
                "height of the prism : ");
        String s = "length * breadth * height";
        System.out.println("Formula to find the volume of rectangular prism = " + s);
        System.out.println("Enter the length of the prism : ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the prism : ");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the prism : ");
        double height = sc.nextDouble();
        double volume = length * width * height;
        System.out.println("Volume of the rectangular prism with \nlength = " + length + " units\n" +
                "width = " + width + " units\n" +
                "height = " + height + " units\n" +
                "= " + volume + " cu. units");
    }
}
