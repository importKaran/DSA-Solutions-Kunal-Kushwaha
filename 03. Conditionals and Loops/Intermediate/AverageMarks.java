package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class AverageMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the average marks : ");
        System.out.println("Do you want to give input for all subjects by yourself, or use the default input?");
        System.out.println("Press 1 for default input");
        System.out.println("Press 2 to give custom input");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        int subjects = 1;
        int[] marks = new int[0];
        switch (choice) {
            case 1 :
                subjects = 5;
                marks = new int[]{70, 80, 90, 80, 90};
                break;
            case 2 :
                System.out.println("Enter the number of subjects : ");
                subjects = sc.nextInt();
                marks = new int[subjects];
                System.out.println("Enter the marks for ");
                for(int i = 0; i < subjects; i++) {
                    System.out.println("Subject " + (i + 1) + " : ");
                    marks[i] = sc.nextInt();
                }
                break;
            default :
                System.out.println("Oops! Wrong option entered or chosen!");
                System.exit(0);
        }
        int sum = 0;
        for(int i = 0; i < subjects; i++)
            sum += marks[i];
        float average = (float)sum / subjects;
        System.out.println("Total marks obtained in " + subjects + " subjects = " + sum +
                " out of " + (subjects * 100));
        System.out.println("Average marks = " + average);
    }
}
