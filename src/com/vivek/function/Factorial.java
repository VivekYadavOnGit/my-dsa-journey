package com.vivek.function;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int givenNum = in.nextInt();

        calculateFact(givenNum);
    }

    public static int calculateFact(int a){
        int fact = 1;
        for (int i = a; i > 0; i--){
            fact = fact * i;
        }
        System.out.println("Factorial of "+a+" is "+fact);
        return fact;
    }
}
