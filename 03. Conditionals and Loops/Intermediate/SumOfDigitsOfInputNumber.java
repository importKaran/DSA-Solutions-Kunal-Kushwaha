package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class SumOfDigitsOfInputNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the sum of digits of user input number : ");
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("The sum of digits of " + n + " = ");
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem;
        }
        System.out.println(sum);
    }
}
