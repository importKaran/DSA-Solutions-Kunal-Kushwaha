package com.karan.Functions;

import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find whether the candidate is eligible to vote or not, where age is given as" +
                " an user input : ");
        System.out.println("Enter the age of the candidate : ");
        int age = sc.nextInt();
        if(isEligibleToVote(age))
            System.out.println("Yay! The candidate can cast his vote!");
        else
            System.out.println("Oops! The candidate is under age! He needs to wait for another " + (18 - age) + " " +
                    "years before casting the first vote!");
    }

    public static boolean isEligibleToVote(int age) {
        if(age < 0) {
            System.out.println("The age can't be negative!");
            System.exit(1);
        }
        return age >= 18;
    }
}
