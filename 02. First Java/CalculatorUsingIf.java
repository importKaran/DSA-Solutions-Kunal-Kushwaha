package com.karan;

import java.util.Scanner;

public class CalculatorUsingIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to perform mathematical operations on 2 numbers and the mathematical sign " +
                "input by the user : ");
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Enter the mathematical operation to be performed :");
        System.out.println("Enter + to perform addition\n" +
                "Enter - to perform subtraction\n" +
                "Enter * to perform multiplication\n" +
                "Enter / to perform division\n" +
                "Enter % to perform modulo division");
        char c = sc.next().charAt(0);
        if(c == '+')
            System.out.println(a + " + " + b + " = " + (a + b));
        else if(c == '-')
            System.out.println(a + " - " + b + " = " + (a - b));
        else if(c == '*')
            System.out.println(a + " x " + b + " = " + (a * b));
        else if(c == '%') {
            if(a == 0  ||  b == 0)
                System.out.println("Cannot perform modulo division with 0!");
            else
                System.out.println(a + " % " + b + " = " + (a % b));
        }
        else if(c == '/') {
            if(b == 0)
                System.out.println("Cannot perform division with 0 as mathematically not possible!");
            else
                System.out.println(a + " % " + b + " = " + (a / b));
        } else
            System.out.println("Not able to perform any operation due to wrong mathematical operator entered!");
    }
}
