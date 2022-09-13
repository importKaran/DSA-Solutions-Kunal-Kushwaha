package com.karan.LoopsConditionals;

import java.util.Scanner;

public class AllFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find all the factors of the given user input integer : ");
        System.out.println("Enter an integer : ");
        int n = sc.nextInt();
        System.out.println("The factors of " + n + " are : ");
        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0)
                System.out.print(i + ", ");
        }
        System.out.println(n);
    }
}
