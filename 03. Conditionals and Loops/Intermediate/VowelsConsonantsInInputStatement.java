package com.karan.LoopsConditionalsIntermediate;

import java.util.Scanner;

public class VowelsConsonantsInInputStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the number of vowels and consonants in user input sentence : ");
        System.out.println("Enter the sentence : ");
        String s = sc.nextLine();
        int vowels = 0, consonants = 0, spaces = 0, numbers = 0, otherSymbols = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if((c >= 'a'  &&  c <= 'z') || (c >= 'A'  &&  c <= 'Z')) {
                if(c == 'a'  ||  c == 'A'  ||
                        c == 'e'  ||  c == 'E'  ||
                        c == 'i'  ||  c == 'I'  ||
                        c == 'o'  ||  c == 'O'  ||
                        c == 'u'  ||  c == 'U')
                    vowels++;
                else
                    consonants++;
            } else if(c == ' ')
                spaces++;
            else if(c >= '0'  &&  c <= '9')
                numbers++;
            else
                otherSymbols++;
        }

        System.out.println("In the statement, total number of \n" +
                "Vowels = " + vowels + "\n" +
                "Consonants = " + consonants + "\n" +
                "Spaces = " + spaces + "\n" +
                "Numbers = " + numbers + "\n" +
                "Other Symbols = " + otherSymbols);
    }
}
