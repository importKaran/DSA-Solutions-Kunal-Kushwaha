package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class Commission {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find either the commission percentage or the commission amount : ");
        System.out.println("What do you want to find?");
        System.out.println("Press 1 to find the commission percentage :");
        System.out.println("Press 2 to find the commission amount : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("Please enter the original amount : ");
                double amount = sc.nextDouble();
                System.out.println("Please enter the commission amount : ");
                double commission = sc.nextDouble();
                double percentage = (commission / amount) * 100;
                System.out.println("The commission percentage for above transaction is : " + percentage + "%");
                break;
            case 2 :
                System.out.println("Please enter the original amount : ");
                amount = sc.nextDouble();
                System.out.println("Please enter the commission percentage : ");
                percentage = sc.nextDouble();
                commission = amount * percentage / 100;
                System.out.println("The commission amount for above transaction is : " + commission);
                break;
            default :
                System.out.println("You've entered an incorrect choice!");
                break;
        }
    }
}
