package com.vivek.first_codes;
import java.util.Scanner;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 2 Numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int a = num1, b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int hcf = a;

        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF of "+num1+ " and "+num2+ " is "+ hcf);
        System.out.println("LCM of "+num1+ " and "+num2+ " is "+ lcm);
        in.close();
    }
}
