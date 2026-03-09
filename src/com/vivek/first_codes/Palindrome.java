package com.vivek.first_codes;
import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        //checking for all lowercase or any spaces.
        input = input.toLowerCase().replaceAll("\\s","");

        //Reverse the String.
        String rev = "";
        for (int i = input.length()-1; i >= 0 ; i--) {
            rev = rev + input.charAt(i);
        }

        //Checking palindrome or not.
        if (input.equals(rev)){
            System.out.println("The String is PALINDROME");
        } else {
            System.out.println("The String is NOT PALINDROME");
        }
    }
}

