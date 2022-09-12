package com.karan;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find whether the input number is even or odd : ");
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        // We can even use if((x & 1) == 1) then odd else even
        if(x % 2 == 0)
            System.out.println("The number " + x + " is an Even number!");
        else
            System.out.println("The number " + x + " is an Odd number!");
    }
}
