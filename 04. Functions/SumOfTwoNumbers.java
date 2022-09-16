package com.karan.Functions;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the sum of 2 user input numbers using function : ");
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("The sum of " + a + " + " + b + " = " + sum(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
