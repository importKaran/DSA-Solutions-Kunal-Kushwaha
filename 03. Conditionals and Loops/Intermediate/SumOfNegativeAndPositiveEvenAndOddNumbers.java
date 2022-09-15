package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class SumOfNegativeAndPositiveEvenAndOddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find sum of negative numbers, positive even numbers and positive odd numbers" +
                " all differently : ");
        System.out.println("Enter 0 to stop inputting numbers : ");
        int sumOfNegativeNumbers = 0, sumOfPositiveEvenNumbers = 0, sumOfPositiveOddNumbers = 0;
        while(true) {
            System.out.println("Enter a number : ");
            int n = sc.nextInt();
            if(n == 0)
                break;
            if(n < 0)
                sumOfNegativeNumbers += n;
            else if(n % 2 == 0)
                sumOfPositiveEvenNumbers += n;
            else
                sumOfPositiveOddNumbers += n;
        }
        System.out.println("Sum of Negative numbers : " + sumOfNegativeNumbers);
        System.out.println("Sum of Positive even numbers : " + sumOfPositiveEvenNumbers);
        System.out.println("Sum of Positive odd numbers : " + sumOfPositiveOddNumbers);
    }
}
