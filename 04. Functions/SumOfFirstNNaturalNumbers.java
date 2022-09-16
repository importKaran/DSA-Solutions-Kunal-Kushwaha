package com.karan.Functions;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the sum of first n natural numbers where n will be input by user using " +
                "function : ");
        System.out.println("Enter the number upto which sum needs to be calculated : ");
        int n = sc.nextInt();
        System.out.println("Sum of natural numbers from 1 to " + n + " = " + sum(n));
    }

    public static int sum(int n) {
        return n * (n + 1) / 2;
    }
}
