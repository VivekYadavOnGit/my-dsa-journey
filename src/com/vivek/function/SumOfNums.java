package com.vivek.function;
import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1 = in.nextInt();

        System.out.print("Enter 2nd Number: ");
        int num2 = in.nextInt();

        firstSum(num1);
        lastSum(num2);
        betwnSum(num1, num2);

    }
    public static int firstSum(int num1){
        int sum = 0;
        for (int i = 0; i <= num1; i++){
             sum += i;
        }
        System.out.println("Sum of Number's till "+num1+" = "+sum);
        return sum;
    }

    public static int lastSum(int num2){
        int sum = 0;
        for (int i = 0; i <= num2; i++){
             sum += i;
        }
        System.out.println("Sum of Number's till "+num2+" = "+sum);
        return sum;
    }

    public static int betwnSum(int num1, int num2){
        int sum = 0;
        for (int i = num1; i <= num2; i++){
            sum += i;
        }
        System.out.println("Sum of Number's "+num1+" till "+num2+" = "+sum);
        return sum;
    }

}
