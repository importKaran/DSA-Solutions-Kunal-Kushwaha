package com.karan.LoopsConditionals;

import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the volume of a cylinder using user input radius and height : ");
        char c = '\u03C0';  // symbol of pi
        String s = c + " * (r ^ 2) * h";
        System.out.println("Formula to find volume of a cylinder = " + s);
        System.out.println("Enter radius of the cylinder : ");
        double rad = sc.nextDouble();
        System.out.println("Enter height of the cylinder : ");
        double height = sc.nextDouble();
        double volume = Math.PI * (rad * rad) * height;
        System.out.println("Volume of the cylinder with \nradius = " + rad + " units\n" +
                "height = " + height + " units\n" +
                "= " + volume + " cu. units");
    }
}
