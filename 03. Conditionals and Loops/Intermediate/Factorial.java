package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the factorial of the number input by the user : ");
        System.out.println("Enter a number to find its factorial : ");
        int n = sc.nextInt();
        System.out.println("The Factorial of " + n + " is");
        System.out.print("= ");
        long fact = 1;
        while(n > 0) {
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
