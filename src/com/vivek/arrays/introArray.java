package com.vivek.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class introArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String [] arr = new String[3];

        for (int i = 0; i < arr.length; i++) {      // Array Input
             arr[i] = in.nextLine();
        }

//        for (int i = 0; i < arr.length; i++) {      // Type 1: of Printing array
//            System.out.print(arr[i]+ " ");
//        }

        System.out.println(Arrays.toString(arr));
    }
}
