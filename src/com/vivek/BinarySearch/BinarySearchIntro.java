package com.vivek.BinarySearch;

public class BinarySearchIntro {
    static void main() {
        int[] arr = {-8, -4, -2, -0, -2, 3, 5, 18, 25, 45, 56, 78, 89, 90};
        int target = 90;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
