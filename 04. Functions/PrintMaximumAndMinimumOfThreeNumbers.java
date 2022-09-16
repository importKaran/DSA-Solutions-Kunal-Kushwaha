package com.karan.Functions;

import java.util.Scanner;

public class PrintMaximumAndMinimumOfThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the maximum and minimum of 3 user input numbers using function : ");
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();
        System.out.println("The MAXimum number is : " + max(a, b, c));
        System.out.println("The MINimum number is : " + min(a, b, c));
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if(max < b)
            max = b;
        if(max < c)
            max = c;
        return max;
    }

    public static int min(int a, int b, int c) {
        int min = a;
        if(min > b)
            min = b;
        if(min > c)
            min = c;
        return min;
    }
}
