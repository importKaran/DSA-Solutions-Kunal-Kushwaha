package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class SIPCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the returns on investment based on the user input SIP parameters");
        System.out.println("Enter the monthly instalment amount : ");
        double monthlyAmount = sc.nextDouble();
        double yearlyAmount = monthlyAmount * 12;
        System.out.println("Enter the number of years to predict the returns : ");
        int numberOfYears = sc.nextInt();
        System.out.println("Enter the expected rate of interest : ");
        double rate = sc.nextDouble();
        double temp = 1 + (rate / 100);
        double finalAmount = yearlyAmount * Math.pow(temp, numberOfYears);
        System.out.println("The stats are :\n" +
                "Monthly instalment = " + monthlyAmount + "\n" +
                "Yearly investment / Total investment = " + monthlyAmount + " x 12 = " + yearlyAmount + "\n" +
                "Number of years = " + numberOfYears + "\n" +
                "Rate of Interest p.a. = " + rate + " %\n" +
                "After compounding with these specs, the final amount would be = " + finalAmount + "\n" +
                "Total interest gained = " + (finalAmount - yearlyAmount));
    }
}
