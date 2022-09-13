package com.karan.LoopsConditionals;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find Curved Surface Area of Cylinder using user input radius and height : ");
        char c = '\u03C0';  // symbol for pi
        String s = "2 * " + c + " * r * h";
        System.out.println("Formula to find the Curved Surface area of Cylinder = " + s);
        System.out.println("Enter the radius of the cylinder : ");
        double rad = sc.nextDouble();
        System.out.println("Enter the height of the cylinder : ");
        double height = sc.nextDouble();
        double curvedSurfaceArea = 2 * Math.PI * rad * height;
        System.out.println("Curved Surface Area of a cylinder with \nradius = " + rad + " units\n" +
                "height = " + height + " units\n" +
                "= " + curvedSurfaceArea + " sq. units");
    }
}
