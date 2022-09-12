package com.karan;

import java.util.Scanner;

public class PrintGreetingMessage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to accept user name and print greeting message to that user : ");
        System.out.println("Enter your name : ");
        String s = sc.nextLine();
        System.out.println("Hello, " + s + "! \nWish you a good day!");
    }
}
