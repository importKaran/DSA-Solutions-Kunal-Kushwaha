package com.karan.Problems;

import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) {

        System.out.println("\nProgram to find whether entered year is a leap year or not :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year between 1000 and 9999 : ");
        int year = sc.nextInt();

        boolean isLeap = false;
        if(year % 100 == 0  &&  year % 400 == 0)
            isLeap = true;
        else if(year % 100 != 0  &&  year % 4 == 0)
            isLeap = true;

        if(isLeap)
            System.out.println("Year " + year + " is a leap year with 366 days!");
        else
            System.out.println("Year " + year + " is NOT a leap year, and has only 365 days!");
    }
}
