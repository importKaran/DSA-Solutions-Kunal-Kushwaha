package com.karan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n---Enter x to stop inputting---");
        System.out.println("Till then enter numbers, separated by enter key :");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int sum = 0;
        while(!x.equals("x")) {
            int num = Integer.parseInt(x);
            sum += num;
            x = sc.nextLine();
        }
        System.out.println("The sum of all numbers entered is : " + sum);
    }
}
