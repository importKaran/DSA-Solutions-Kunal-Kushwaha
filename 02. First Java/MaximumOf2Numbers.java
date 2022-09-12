package com.karan;

import java.util.Scanner;

public class MaximumOf2Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to convert INR to USD :");
        System.out.println("Enter amount in Indian rupees : ");
        float rupees = sc.nextFloat();
        float usd = rupees / 79.37f;
        System.out.println("Rs. " + rupees + " = $" + usd);
    }
}
