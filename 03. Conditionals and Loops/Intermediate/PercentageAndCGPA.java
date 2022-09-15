package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class PercentageAndCGPA {

    /*
    Formula for finding out CGPA :
    1. Add all subject marks
    2. Divide it with total number of subjects, to get the average marks
    3. Divide average with 10 to get CGPA out of 10, as all marks are considered out of 100

    Formula for finding out percentage when CGPA is known :
    percentage = CPGA * 9.5
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the CGPA and Percentage : ");
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
        float CGPA = average / 10;
        System.out.println("Total marks obtained in " + subjects + " subjects = " + sum +
                " out of " + (subjects * 100));
        System.out.println("Average marks = " + average);
        System.out.println("CGPA obtained is = " + CGPA);
        System.out.println("Percentage obtained is = " + (CGPA * 9.5) + " %");
    }
}
