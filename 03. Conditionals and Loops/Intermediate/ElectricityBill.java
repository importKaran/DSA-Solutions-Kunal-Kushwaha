package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class ElectricityBill {

    /*
    1 to 100 units      – Rs. 10/unit
    100 to 200 units    – Rs. 15/unit
    200 to 300 units    – Rs. 20/unit
    above 300 units     – Rs. 25/unit
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find Electricity bill for user input units : ");
        System.out.println("Enter number of units used : ");
        int units = sc.nextInt();
        int bill = 0;
        if(units <= 100) {
            bill = units * 10;
        } else if(units <= 200) {
            // For the first 100 units, charge is 100 * 10 = 1000
            bill = (units - 100) * 15 + 1000;
        } else if(units <= 300) {
            // For the first 100 units, charge is 100 * 10 = 1000
            // For the next 100 units, charge is 100 * 15 = 1500
            bill = (units - 200) * 20 + 1000 + 1500;
        } else {
            // For the first 100 units (1 - 100), charge is 100 * 10 = 1000
            // For the next 100 units (101 - 200), charge is 100 * 15 = 1500
            // For the next 100 units (201 - 300), charge is 100 * 20 = 2000
            bill = (units - 300) * 25 + 1000 + 1500 + 2000;
        }
        System.out.println("For " + units + " units of Electricity used, the bill will be = " + bill);
    }
}
