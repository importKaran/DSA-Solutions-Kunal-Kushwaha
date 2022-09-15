package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class AverageOfFirstNNaturalNumbers {

    /*
    sum of n natural number n(n+1)/2,
    we find the Average of n natural numbers
    so divide by n is n(n+1)/2*n = (n+1)/2
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the average of first n natural numbers using user input n : ");
        System.out.println("Enter the number upto which average of natural numbers need to be taken : ");
        int n = sc.nextInt();
        float ans = (n + 1) / 2f;
        System.out.println("Average of first " + n + " natural numbers = " + ans);
    }
}
