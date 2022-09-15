package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find power of a number without using in-built library : ");
        System.out.println("Enter the base number : ");
        int base = sc.nextInt();
        System.out.println("Enter the power which it needs to be raised : ");
        int power = sc.nextInt();
        System.out.print(base + " ^ " + power + " = ");
        long ans = 1;
        while(power > 0) {
            ans *= base;
            power--;
        }
        System.out.println(ans);
    }
}
