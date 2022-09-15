package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class BattingAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the Batting average of a batsman taking user input : ");
        System.out.println("Enter the number of runs scored by the batsman : ");
        int runs = sc.nextInt();
        System.out.println("Enter the number of innings required to score " + runs + " runs : ");
        int totalInnings = sc.nextInt();
        System.out.println("Enter the number of innings in which the batsman stood not out : ");
        int notOutInnings = sc.nextInt();
        if(notOutInnings > totalInnings)
            System.out.println("Couldn't calculate as wrong input entered!");
        else if(notOutInnings == 0  ||  notOutInnings == totalInnings)
            System.out.println("The average couldn't be calculated as the batsman is on undefeated streak!");
        else {
            int outInnings = totalInnings - notOutInnings;
            double average = (double)runs / outInnings;
            System.out.println("The stats of the batsman are as follows :");
            System.out.println("Total number of innings played by the batsman : " + totalInnings);
            System.out.println("Total number of dismissals : " + outInnings);
            System.out.println("Total runs scored by the batsman : " + runs);
            System.out.println("Batting average of the batsman : " + average);
        }
    }
}
