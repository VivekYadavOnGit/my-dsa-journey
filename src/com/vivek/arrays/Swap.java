package com.vivek.arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap( int[] num, int index1, int index2){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
