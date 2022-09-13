package com.karan.LoopsConditionals;

import java.util.Scanner;

public class AreaOfRhombus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the area of Rhombus using user input length of 2 diagonals : ");
        String s = "(1 / 2) * d1 * d2";
        System.out.println("Formula to find the area of Rhombus is : " + s);
        System.out.println("Enter the length of 1st diagonal : ");
        double d1 = sc.nextDouble();
        System.out.println("Enter the length of 2nd diagonal : ");
        double d2 = sc.nextDouble();
        double area = (d1 * d2) / 2;
        System.out.println("Area of the Rhombus with \nDiagonal-1 length = " + d1 + " units\n" +
                "Diagonal-2 length = " + d2 + " units\n= " + area + " sq. units");
    }
}
