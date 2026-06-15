package com.vivek.L14AndL15BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }

            else if (target > arr[mid]) {
                start = mid + 1;
            }

            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] num = {-56, -48, -12, -4, 0, 2, 6, 8, 16, 18, 41,59};

        int target = 18;

        System.out.println(binarySearch(num, target));
    }
}
