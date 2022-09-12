package com.karan;

import java.util.Scanner;

public class MaximumOf2Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find maximum of the 2 user input numbers : ");
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        if(a > b)
            System.out.println(a + " > " + b + "\n" + a + " is the greater number!");
        else if(a < b)
            System.out.println(a + " < " + b + "\n" + b + " is the greater number!");
        else
            System.out.println(a + " = " + b + "\nBoth numbers are equal!");
    }
}
