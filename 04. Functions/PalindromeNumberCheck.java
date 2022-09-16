package com.karan.Functions;

import java.util.Scanner;

public class PalindromeNumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to check whether the user input number is a palindrome number or not using " +
                "function : ");
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(isPalindrome(num))
            System.out.println(num + " is a Palindrome number!");
        else
            System.out.println(num + " is NOT a Palindrome number!");
    }

    public static boolean isPalindrome(int num) {

        int rev = 0, temp = num;
        while(num > 0) {
            int rem = num % 10;
            num /= 10;
            rev = rev * 10 + rem;
        }

        return rev == temp;
    }
}
