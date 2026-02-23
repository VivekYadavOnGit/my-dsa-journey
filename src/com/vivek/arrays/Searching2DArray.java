package com.vivek.arrays;
import java.util.Arrays;

public class Searching2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {21, 32, 56},
                {78, 89, 55, 75},
                {23, 21, 48, 65, 58},
                {45, 2, 65, 52, 69, -64}
        };
//        int target = 64;
//        int[] ans = search(arr, target);
        System.out.println(Min(arr));
    }


    //Search elements in 2D Array
    static int[] search(int[][] arr, int target){

        if (arr.length == 0){
            return new int[]{-1, -1};
        }
        else{
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] == target){
                    return new int[]{row, col};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }


    //Search MAXIMUM elements in 2D Array
    static int Max(int[][] arr){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }


    //Searching MINIMUM element in 2D Array
    static int Min(int[][] arr){
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}

