package com.karan.Problems;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to print multiplication table of the number in user input : ");
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Multiplication table of " + a + " is : ");
        for(int i = 1; i <= 10; i++)
            System.out.println(a + " x " + i + " = " + (a * i));
    }
}
