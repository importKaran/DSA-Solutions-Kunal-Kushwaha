package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class CalculateDiscount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the discount percentage using user input Cost Price and Selling Price :");
        System.out.println("Enter the Cost Price : ");
        double cp = sc.nextDouble();
        System.out.println("Enter the Selling Price : ");
        double sp = sc.nextDouble();
        double discount = ((cp - sp) / cp) * 100;
        System.out.println("The discount on Selling price as compared to Cost price is\n= " + discount + "%");
    }
}
