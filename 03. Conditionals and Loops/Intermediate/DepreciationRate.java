package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class DepreciationRate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the depreciation rate of an item when original value and value after n " +
                "years is known : ");
        System.out.println("Enter the original value of the item : ");
        double originalValue = sc.nextDouble();
        System.out.println("Enter the tenure (number of years) to find the rate : ");
        int years = sc.nextInt();
        System.out.println("Enter the value of the item after " + years + " years : ");
        double salvageValue = sc.nextDouble();
        double difference = originalValue - salvageValue;
        double depreciation = difference / years;
        double depreciationRate = depreciation / difference * 100;
        System.out.println("The rate of the item is depreciating by \n= " + depreciationRate + " % p.a.");

        System.out.println("\nValue of item each year after " + depreciationRate + " % p.a. Depreciation Rate" +
                " :");
        System.out.println("Year 0 => " + originalValue);
        for(int i = 1; i <= years; i++) {
            originalValue -= depreciation;
            System.out.println("Year " + i + " => " + originalValue);
        }
    }
}
