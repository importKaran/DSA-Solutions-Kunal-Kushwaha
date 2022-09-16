package com.karan.Functions;

import java.util.Scanner;

public class PrimeNumberOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to check whether an user input number is prime or not using function : ");
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(isPrime(num))
            System.out.println(num + " is a Prime number!");
        else
            System.out.println(num + " is NOT a Prime number!");
    }

    public static boolean isPrime(int num) {

        if(num == 1) {
            System.out.println("1 is neither prime nor composite");
            System.exit(1);
        }
        if(num % 2 == 0)
            return false;
        for(int i = 3; i <= num / 2; i += 2)
            if(num % i == 0)
                return false;
        return true;
    }
}
