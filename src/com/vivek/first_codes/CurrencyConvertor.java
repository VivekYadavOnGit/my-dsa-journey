package com.vivek.first_codes;
import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount(₹): ");
        float Amt = sc.nextFloat();

        float inUSD =  Amt * 0.011f;

        System.out.print("Amount($): "+ inUSD);
    }
}
