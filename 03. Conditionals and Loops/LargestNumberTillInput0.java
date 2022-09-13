package com.karan.LoopsConditionals;

import java.util.Scanner;

public class LargestNumberTillInput0 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("\nProgram to find the largest of all numbers entered by user until 0 is entered : ");
        int n, max = Integer.MIN_VALUE;
        do {
            System.out.println("Enter a number : ");
            n = sc.nextInt();
            if(max < n)
                max = n;
        } while(n != 0);
        System.out.println("The largest number of all numbers entered till now = " + max);
    }
}
