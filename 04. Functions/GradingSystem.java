package com.karan.Functions;

import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the grades of the student based on the marks given as an user input " +
                "using function : ");
        System.out.println("Enter the marks out of 100 : ");
        int marks = sc.nextInt();
        if(marks > 100  ||  marks < 0)
            System.out.println("Wrong marks entered! Re-run the program using correct marks!");
        else {
            String grade = grades(marks);
            System.out.println("The result is : ");
            System.out.println(grade);
        }
    }

    public static String grades(int marks) {
        if(marks >= 91)
            return "AA";
        else if(marks >= 81)
            return "AB";
        else if(marks >= 71)
            return "BB";
        else if(marks >= 61)
            return "BC";
        else if(marks >= 51)
            return "CD";
        else if(marks >= 41)
            return "DD";
        else
            return "Fail";
    }
}
