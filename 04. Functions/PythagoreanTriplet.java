package com.karan.Functions;

import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to check whether 3 input numbers are Pythagorean triplet or not using function:");
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int c = sc.nextInt();
        isPythogoreanTriplet(a, b, c);
    }

    public static void isPythogoreanTriplet(int a, int b, int c) {

        if(a == b  &&  b == c)
            System.out.println("All three numbers are same! And same numbers can't be Pythagorean Triplet!");
        else {
            boolean flag = false;
            int max = a;
            if(max < b) max = b;
            if(max < c) max = c;
            if(max == a) {
                if((a * a) == ((b * b) + (c * c)))
                    flag = true;
            } else if(max == b) {
                if((b * b) == ((a * a) + (c * c)))
                    flag = true;
            } else {
                if((c * c) == ((a * a) + (b * b)))
                    flag = true;
            }
            if(flag)
                System.out.println(a + ", " + b + ", " + c + " are Pythagorean triplet!");
            else
                System.out.println(a + ", " + b + ", " + c + " do not form a Pythagorean triplet!");
        }
    }
}
