package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class EvenDaysInAMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the number of days with even dates using user input month : ");
        System.out.println("Press 1 for January\n.\n.\n.Press 12 for December");
        System.out.println("Enter the month number : ");
        int choice = sc.nextInt();
        int evenDays = 0;
        if(choice == 2)
            evenDays = 14;
        else if(choice >= 1  &&  choice <= 12)
            evenDays = 15;
        else {
            System.out.println("This month doesn't exist!");
            System.exit(0);
        }
        System.out.println("The number of even days in the month " + choice + " = " + evenDays);
    }
}
