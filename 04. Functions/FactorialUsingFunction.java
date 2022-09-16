package com.karan.Functions;

import java.util.Scanner;

public class FactorialUsingFunction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to calculate the factorial of an user input number using function : ");
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Factorials of negative numbers cannot be found!");
            System.out.println("Terminating the program!");
            System.exit(1);
        }

        int fact = factorial(num);
        System.out.println(num + "! = " + fact);
    }

    public static int factorial(int num) {
        if(num == 0)
            return 1;
        return num * factorial(num - 1);
    }
}
