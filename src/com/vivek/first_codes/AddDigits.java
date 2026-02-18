package com.vivek.first_codes;
import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.print("Sum of digits are: "+sum);
    }
}
