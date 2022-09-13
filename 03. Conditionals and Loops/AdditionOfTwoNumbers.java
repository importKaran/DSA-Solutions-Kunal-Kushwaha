package com.karan.LoopsConditionals;

import java.util.Scanner;

public class AdditionOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the sum of 2 numbers obtained from user input : ");
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Sum of these numbers is =\n" + a + " + " + b + " = " + (a + b));
    }
}
