package com.karan.LoopsConditionals;

import java.util.Scanner;

public class SumOfNumbersTillInput0 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("\nProgram to find the sum of all numbers entered by user until 0 is entered : ");
        int n, sum = 0;
        do {
            System.out.println("Enter a number : ");
            n = sc.nextInt();
            sum += n;
        } while(n != 0);
        System.out.println("The sum of numbers entered till now = " + sum);
    }
}
