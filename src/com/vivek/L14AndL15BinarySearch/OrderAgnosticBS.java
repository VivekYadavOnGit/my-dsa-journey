package com.vivek.L14AndL15BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int target = 0;
        System.out.println(orderAgnosticBS(arr, target));
    }
    public static int orderAgnosticBS(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsce = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) return mid;
            if(isAsce){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
