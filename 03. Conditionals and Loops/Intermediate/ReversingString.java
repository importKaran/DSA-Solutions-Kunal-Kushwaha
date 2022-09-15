package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class ReversingString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to reverse a string without using in-built libraries : ");
        System.out.println("Enter a string to reverse : ");
        String s = sc.nextLine();
        System.out.println("The original string was : " + s);
        StringBuilder rev = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--)
            rev.append(s.charAt(i));
        System.out.println("The reversed string is : " + rev.toString());
    }
}
