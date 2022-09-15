package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class nCr_nPr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the nCr and nPr where n and r will be input by the user : ");
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();
        if(r > n) {
            System.out.println("Oops! Value of r can't be greater than n!");
            System.exit(1);
        }
        long nFact = factorial(n);
        long nMinusRFact = factorial(n - r);
        long rFact = factorial(r);
        long nPr = nFact / nMinusRFact;
        long nCr = nFact / (rFact * nMinusRFact);
        System.out.println("nCr = " + nCr);
        System.out.println("nPr = " + nPr);
    }

    public static long factorial(int n) {
        long fact = 1;
        while(n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }
}
