package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find whether the user input number is palindrome or not :");
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int temp = n, rev = 0;
        while(temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            rev = rev * 10 + rem;
        }
        if(rev == n)
            System.out.println("The number " + n + " is a palindrome number!");
        else
            System.out.println("The number is " + n + " while its reverse is " + rev +
                    ", hence not a palindrome number");
    }
}
