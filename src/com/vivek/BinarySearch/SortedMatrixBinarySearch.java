package com.vivek.BinarySearch;

import java.util.Arrays;

public class SortedMatrixBinarySearch {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15}
        };

        System.out.println(Arrays.toString(search(matrix, 11)));
    }

    static int[] binarySearch(int[][] matrix, int target, int row, int colStart, int colEnd) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length; // Be careful: if the matrix is empty, this will throw an error. You might want to add a check for that.

        if (rows == 1) {
            return binarySearch(matrix, target, 0, 0, cols - 1);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Narrow rows to 2
        while (rStart < (rEnd - 1)) {

            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now only 2 rows remain

        if (matrix[rStart][cMid] == target)
            return new int[]{rStart, cMid};

        if (matrix[rStart + 1][cMid] == target)
            return new int[]{rStart + 1, cMid};

        // Search 4 quadrants

        // 1st
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, target, rStart, 0, cMid - 1);
        }

        // 2nd
        if (target >= matrix[rStart][cMid + 1] &&
                target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, target, rStart, cMid + 1, cols - 1);
        }

        // 3rd
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, target, rStart + 1, 0, cMid - 1);
        }

        // 4th
        return binarySearch(matrix, target, rStart + 1, cMid + 1, cols - 1);
    }
}