package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find all the Perfect numbers between given range : ");

        // A number is an Perfect number if sum of all factors is equal to the number itself
        // For example : 28 = 1 + 2 + 4 + 7 + 14 = 28
        // For example : 496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496

        System.out.println("Enter the lower limit of range : ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper limit of range : ");
        int upper = sc.nextInt();
        System.out.println("The Perfect numbers between " + lower + " and " + upper + " are : ");
        for(int i = lower; i < upper; i++) {
            if(isPerfect(i))
                System.out.println(i);
        }
    }

    public static boolean isPerfect(int n) {
        int sum = 1;
        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0)
                sum += i;
        }
        return sum == n;
    }
}
