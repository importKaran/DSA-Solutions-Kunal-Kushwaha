package com.karan.Problems;

import java.util.Scanner;

public class LCM_GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the GCD and LCM of 2 numbers : ");
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        if(num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int gcd = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is : " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is : " + lcm(num1, num2, gcd));
    }

    public static int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
