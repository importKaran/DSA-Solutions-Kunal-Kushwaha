package com.karan.LoopsConditionals;

import java.util.Scanner;

public class DifferenceOfProductAndSumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the difference between the product and sum of the digits of the given " +
                "number : ");
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int prod = 1, sum = 0;
        while(n > 0) {
            int rem = n % 10;
            prod *= rem;
            sum += rem;
            n /= 10;
        }
        System.out.println("The product of the digits = " + prod);
        System.out.println("The sum of the digits = " + sum);
        System.out.println("The difference between the product and sum of digits = " + (prod - sum));
    }
}
