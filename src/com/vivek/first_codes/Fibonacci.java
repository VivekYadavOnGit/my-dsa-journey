package com.vivek.first_codes;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(num1+ " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
}
