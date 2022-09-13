package com.karan.LoopsConditionals;

import java.util.Scanner;

public class VolumeOfCone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the volume of a cone using user input radius and height : ");
        char c = '\u03C0';  // symbol of pi
        String s = "(1 / 3) * " + c + " * (r ^ 2) * h";
        System.out.println("Formula to find volume of a cone = " + s);
        System.out.println("Enter radius of the cone : ");
        double rad = sc.nextDouble();
        System.out.println("Enter height of the cone : ");
        double height = sc.nextDouble();
        double volume = (1d / 3d) * Math.PI * (rad * rad) * height;
        System.out.println("Volume of the cone with \nradius = " + rad + " units\n" +
                "height = " + height + " units\n" +
                "= " + volume + " cu. units");
    }
}
