package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to calculate Compound Interest on user input values : ");
        String s = "principal * [(1 + (rate / 100)) ^ numberOfYears]";
        System.out.println("Formula to find Compound interest = " + s);
        System.out.println("Enter the principal amount : ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest applicable : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the number of years for which the interest needs to be calculated : ");
        int numberOfYears = sc.nextInt();
        double temp = 1 + (rate / 100);
        double finalAmount = principal * Math.pow(temp, numberOfYears);
        System.out.println("The final amount to be paid for\n" +
                "Principal amount = " + principal + "\n" +
                "Rate of interest = " + rate + "\n" +
                "For " + numberOfYears + " years is\n" +
                "= " + finalAmount);
    }
}
