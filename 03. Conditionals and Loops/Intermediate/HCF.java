package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the HCF of 2 numbers : ");
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        if(num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int hcf = hcf(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is : " + hcf);
    }

    public static int hcf(int a, int b) {
        if(b == 0)
            return a;
        return hcf(b, a % b);
    }
}
