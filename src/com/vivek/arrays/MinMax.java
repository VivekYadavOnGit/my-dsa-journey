package com.vivek.arrays;

public class MinMax {
    public static void main(String[] args) {

        int[] arr = {77, 22, 44, 99, 55, 11, 33, 88};
        int ans = Max(arr);
        System.out.println(ans);



    }
    static int Min(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    static int Max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
