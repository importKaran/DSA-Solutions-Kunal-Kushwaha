package com.karan.LoopsConditionals;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find Total Surface Area of Cube using user input length of one edge which is" +
                " equal to all the remaining edges : ");
        String s = "6 * (a ^ 2)";
        System.out.println("Formula to find the Total Surface area of Cube = " + s);
        System.out.println("Enter the length of one edge of the cube : ");
        double a = sc.nextDouble();
        double totalSurfaceArea = 6 * (a * a);
        System.out.println("Total Surface Area of a cube with \nedge length = " + a + " units\n" +
                "= " + totalSurfaceArea + " sq. units");
    }
}
