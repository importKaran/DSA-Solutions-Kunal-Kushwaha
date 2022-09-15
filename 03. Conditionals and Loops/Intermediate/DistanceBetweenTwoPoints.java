package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the euclidean distance between 2 points input by user : ");
        char c = '\u221A';  // symbol for square root
        String s = c + " [((x2 - x1) ^ 2) + ((y2 - y1) ^ 2)]";
        System.out.println("Formula to find the euclidean distance between 2 points = " + s);

        System.out.println("For the first point :");
        System.out.println("Enter the X co-ordinate : ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the Y co-ordinate : ");
        double y1 = sc.nextDouble();

        System.out.println("For the second point :");
        System.out.println("Enter the X co-ordinate : ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the Y co-ordinate : ");
        double y2 = sc.nextDouble();

        double distance = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        distance = Math.sqrt(distance);
        System.out.println("Euclidean distance between \npoint (" + x1 + ", " + y1 + ")\n" +
                "point (" + x2 + ", " + y2 + ")\n" +
                "= " + distance + " units");
    }
}
