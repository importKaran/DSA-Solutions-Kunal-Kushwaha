package com.karan.Functions;

import java.util.Scanner;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the product of 2 user input numbers using function : ");
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("The product of " + a + " + " + b + " = " + product(a, b));
    }

    public static int product(int a, int b) {
        return a * b;
    }
}
