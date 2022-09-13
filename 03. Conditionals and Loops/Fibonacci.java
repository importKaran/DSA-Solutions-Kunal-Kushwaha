package com.karan.LoopsConditionals;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the Fibonacci series with user input elements :");
        System.out.println("Enter the number of elements to display in the series : ");
        int n = sc.nextInt();
        System.out.println("The Fibonacci series with " + n + " elements is : ");
        if(n <= 0)
            System.out.println("No elements to display in the series!");
        else if(n == 1)
            System.out.println(0);
        else if(n == 2)
            System.out.println(0 + " " + 1);
        else {
            int prev = 0, current = 1;
            System.out.print(prev + " ");
            for(int i = 1; i < n; i++) {
                System.out.print(current + " ");
                int temp = current + prev;
                prev = current;
                current = temp;
            }
        }
    }
}
