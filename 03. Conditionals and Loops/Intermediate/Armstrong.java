package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find all the Armstrong numbers between given range : ");

        // A number is an Armstrong number if number is equal to sum of power of digits to the count of digits
        // For example : 153 = (1 * 1 * 1) + (5 * 5 * 5) + (3 * 3 * 3)
        // For example : 1634 = (1 * 1 * 1 * 1) + (6 * 6 * 6 * 6) + (3 * 3 * 3 * 3) + (4 * 4 * 4 * 4)

        System.out.println("Enter the lower limit of range : ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper limit of range : ");
        int upper = sc.nextInt();
        System.out.println("The Armstrong numbers between " + lower + " and " + upper + " are : ");
        for(int i = lower; i < upper; i++) {
            if(isArmstrong(i, findDigitCount(i)))
                System.out.println(i);
        }
    }

    public static boolean isArmstrong(int n, int cnt) {

        long sum = 0, temp = n;
        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += Math.pow(rem, cnt);
        }
        return sum == temp;
    }

    public static int findDigitCount(int n) {

        if(-9 <= n  &&  n <= 9)
            return 1;
        else if((-99 <= n  && n <= -10)  ||  (10 <= n  &&  n <= 99))
            return 2;
        else if((-999 <= n  && n <= -100)  ||  (100 <= n  &&  n <= 999))
            return 3;
        else if((-9999 <= n  && n <= -1000)  ||  (1000 <= n  &&  n <= 9999))
            return 4;
        else if((-99999 <= n  && n <= -10000)  ||  (10000 <= n  &&  n <= 99999))
            return 5;
        else if((-999999 <= n  && n <= -100000)  ||  (100000 <= n  &&  n <= 999999))
            return 6;
        else if((-9999999 <= n  && n <= -1000000)  ||  (1000000 <= n  &&  n <= 9999999))
            return 7;
        else if((-99999999 <= n  && n <= -10000000)  ||  (10000000 <= n  &&  n <= 99999999))
            return 8;
        else if((-999999999 <= n  && n <= -100000000)  ||  (100000000 <= n  &&  n <= 999999999))
            return 9;
//        else if((-9999999999L <= n  && n <= -1000000000L)  ||  (1000000000L <= n  &&  n <= 9999999999L))
//            return 10;
        else
            return 10; // because max int value has 10 digits only
    }
}