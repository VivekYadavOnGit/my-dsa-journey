package com.vivek.first_codes;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("The Number you entered "+num+" is Even.");
        }
        else{
            System.out.println("The Number you entered "+num+" is Odd.");
        }
    }
}
