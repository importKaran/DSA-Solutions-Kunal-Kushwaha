package com.karan.Recursion;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Program to find whether the string is palindrome or not using Recursion");
        System.out.println("Enter a string :");
        String s = sc.nextLine();
        if(isPalindrome(s))
            System.out.println("The String " + s + " is Palindrome sequence");
        else
            System.out.println("The String " + s + " is not a Palindrome sequence");
    }

    public static boolean isPalindrome(String s) {
//        System.out.println(s);
        int len = s.length();
        if(len == 1)
            return true;
        else if(len == 2)
            return s.charAt(0) == s.charAt(1);
        else if(s.charAt(0) == s.charAt(len - 1))
            return isPalindrome(s.substring(1, len - 1));
        return false;
    }
}
