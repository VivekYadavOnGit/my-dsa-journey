package com.vivek.first_codes;
import java.util.Scanner;

public class SimpleInterestCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Principle (P):- ");
        double P = in.nextDouble();

        System.out.print("Enter the Rate of Interest (R):- ");
        double R = in.nextDouble();

        System.out.print("Enter the Time Period (T):- ");
        double T = in.nextDouble();
        
        double SimpleInterest = (P * R * T) / 100 ;

        System.out.println("Simple Interest(SI): "+SimpleInterest);
    }


}
