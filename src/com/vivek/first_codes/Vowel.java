package com.vivek.first_codes;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();

        str = str.toLowerCase().replaceAll("\\s","");

        int vowel = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == '0' || ch == 'u'){
                vowel++;
            }
        }
        System.out.print("No of vowels contain: "+vowel);
        in.close();
    }
}
