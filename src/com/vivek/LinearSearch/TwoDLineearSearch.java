package com.vivek.LinearSearch;

import java.util.Arrays;

public class TwoDLineearSearch {
    static void main() {
        int[][] arr = {
                {322, 341, 223, 536},
                {362, 324, 223, 956},
                {329, 344, 225, 556},
                {322, 314, 242, 546}
        };
        int target = 225;
        int[] result = linearSearch(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] linearSearch(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                int element = arr[row][col];
                if(element == target)
                    return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }
}
