package com.karan;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find simple interest using Principal Amount, Number of years and Rate of " +
                "Interest :");
        System.out.println("Enter Principal amount : ");
        int p = sc.nextInt();
        System.out.println("Enter Number of years : ");
        int n = sc.nextInt();
        System.out.println("Enter Rate of Interest : ");
        int r = sc.nextInt();
        int ans = (p * n * r) / 100;
        System.out.println("Simple Interest for \nAmount : " + p + "/-\nNumber of years : " + n + "years\nAt the rate" +
                " of interest of : " + r + "% p.a.\n= " + ans + "/-");
        System.out.println("Total amount to be paid after " + n + " years = " + (p + ans) + "/-");
    }
}
