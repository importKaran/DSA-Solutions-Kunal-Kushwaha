package com.karan.LoopsConditionals;

import java.util.Scanner;

public class PerimeterOfSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the perimeter of a square using user input length of one side which is " +
                "equal to all remaining sides : ");
        String s = "4 * a";
        System.out.println("Formula to find the perimeter of square = " + s);
        System.out.println("Enter the length of one side : ");
        double a = sc.nextDouble();
        double perimeter = 4 * a;
        System.out.println("Perimeter of square with \nside length = " + a + " units\n" +
                "= " + perimeter + " units");
    }
}
