package com.karan.LoopsConditionals;

import java.util.Scanner;

public class VolumeOfSphere {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the volume of a sphere using user input radius : ");
        char c = '\u03C0';  // symbol of pi
        String s = "(4 / 3) * " + c + " * (r ^ 3)";
        System.out.println("Formula to find volume of a sphere = " + s);
        System.out.println("Enter radius of the sphere : ");
        double rad = sc.nextDouble();
        double volume = (4d / 3d) * Math.PI * (rad * rad * rad);
        System.out.println("Volume of the sphere with \nradius = " + rad + " units\n" +
                "= " + volume + " cu. units");
    }
}
