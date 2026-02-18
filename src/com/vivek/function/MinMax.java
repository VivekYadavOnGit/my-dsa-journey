package com.vivek.function;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Nos. ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Nos. ");
        int num2 = in.nextInt();
        System.out.print("Enter 3rd Nos. ");
        int num3 = in.nextInt();

        findMax(num1, num2, num3);
        findMin(num1, num2, num3);
    }
    public static int findMax(int a, int b, int c){
        int max = a;
        if (b > max) {
            max = b;
        } if (c > max) {
            max = c;
        }
        System.out.println("Maximum No is "+max);
        return max;
    }

    public static int findMin(int a, int b, int c){
        int min = a;
        if (b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        System.out.println("Minimum No is "+min);
        return min;
    }
}
