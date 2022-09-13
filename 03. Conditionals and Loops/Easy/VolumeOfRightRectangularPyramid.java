package com.karan.LoopsConditionals;

import java.util.Scanner;

public class VolumeOfRightRectangularPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the volume of a right rectangular pyramid using user length, width and " +
                "height : ");
        String s = "(1 / 3) * length * width * height";
        System.out.println("Formula to find volume of a right rectangular pyramid = " + s);
        System.out.println("Enter length of the pyramid : ");
        double length = sc.nextDouble();
        System.out.println("Enter width of the pyramid : ");
        double width = sc.nextDouble();
        System.out.println("Enter height of the pyramid : ");
        double height = sc.nextDouble();
        double volume = (1d / 3d) * length * width * height;
        System.out.println("Volume of the right rectangular pyramid with \nlength = " + length + " units\n" +
                "width = " + width + " units\n" +
                "height = " + height + " units\n" +
                "= " + volume + " cu. units");
    }
}
