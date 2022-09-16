package com.karan.Functions;

import java.util.Scanner;

public class IsEvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find whether the user input number is even or odd using function : ");
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        evenOrOdd(num);
    }

    public static void evenOrOdd(int num) {
        if((num % 2) == 0)
            System.out.println(num + " is an EVEN number");
        else
            System.out.println(num + " is an ODD number");
    }
}
