package com.vivek.first_codes;
import java.util.Scanner;

public class CompareNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 < num2){
            System.out.println("Largest Number is "+ num2);
        }
        else if(num1 > num2) {
            System.out.println("Largest Number is "+ num1);
        }
        else {
            System.out.println("Both Numbers are Equal");
        }
        sc.close();
    }
}
