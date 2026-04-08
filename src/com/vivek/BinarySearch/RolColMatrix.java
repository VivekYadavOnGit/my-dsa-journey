package com.vivek.BinarySearch;

import java.util.Arrays;

public class RolColMatrix {
    public static void main(String[] args){
        int[][] matrix = {
                {11,22,33,44},
                {15,25,35,45},
                {20,30,40,50},
                {27,37,47,57},
                {32,42,52,62}
        };
        System.out.println(Arrays.toString(search(matrix, 40)));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){

            if (matrix[row][col] == target){
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                row++;
            }
            else col--;
        }
        return new int[] {-1, -1};
    }
}
