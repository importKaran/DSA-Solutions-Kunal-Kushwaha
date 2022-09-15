package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class SumOfFirstNNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the sum of first n natural numbers where n will be input by user : ");
        System.out.println("Enter the number upto which sum needs to be calculated : ");
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("Sum of natural numbers from 1 to " + n + " = " + sum);
    }
}
