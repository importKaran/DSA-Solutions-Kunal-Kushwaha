package com.karan.Functions;

import java.util.Scanner;

public class PrimeNumbersBetweenGivenRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find all the prime number in user input range using function : ");
        System.out.println("Enter the lower range : ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper range : ");
        int upper = sc.nextInt();
        System.out.println("All the prime numbers between " + lower + " and " + upper + " are : ");
        primeNumbers(lower, upper);
    }

    public static void primeNumbers(int lower, int upper) {
        if (lower < 0)
            lower = 0;
        for(int i = lower; i <= upper; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int num) {
        if(num == 1)
            return false;  // since 1 is neither prime, nor composite
        if(num == 2)
            return true;   // because 2 is the only even prime number
        if(num % 2 == 0)
            return false;
        for(int i = 3; i <= num / 2; i += 2)
            if(num % i == 0)
                return false;
        return true;
    }
}
