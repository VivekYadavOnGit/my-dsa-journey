package com.vivek.first_codes;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the First Number: ");
       int num1 = input.nextInt();

       System.out.print("Enter the Second Number: ");
       int num2 = input.nextInt();

        System.out.print("Choose one (+, -, *, /): ");
        char op = input.next().charAt(0);
         int ans = 0;

        if (op == '+'){
            ans = num1 + num2;
        } else if (op == '-') {
            ans = num1 - num2;
        } else if (op == '*') {
            ans = num1 * num2;
        } else if (op == '/') {
            if (num2 != 0) {
                ans = num1 / num2;
            } else {
                System.out.println("Cannot be divided by 0");
                input.close();
                return;
            }
        }
        else{
            System.out.println("Calculation Failed!!");
        }

        System.out.println("Your Calculation is:- " + ans);
        input.close();
    }
}
