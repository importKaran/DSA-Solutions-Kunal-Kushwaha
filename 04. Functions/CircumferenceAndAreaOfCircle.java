package com.karan.Functions;

import java.util.Scanner;

public class CircumferenceAndAreaOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the circumference and area of a circle having user input radius using " +
                "function : ");
        System.out.println("Enter the radius of circle : ");
        double rad = sc.nextDouble();
        double circumference = circumferenceOfCircle(rad);
        double area = areaOfCircle(rad);
        System.out.println("Circle having radius = " + rad + " units\n" +
                "Circumference = " + circumference + " units\n" +
                "Area = " + area + " sq. units");
    }

    public static double circumferenceOfCircle(double rad) {
        return 2 * Math.PI * rad;
    }

    public static double areaOfCircle(double rad) {
        return Math.PI * (rad * rad);
    }
}
