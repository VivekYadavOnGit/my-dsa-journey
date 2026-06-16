package com.vivek.L14AndL15BinarySearch;


public class FlooringNoSoln {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 9, 13, 14, 16, 18};
        int target = 19;
        System.out.println(FlooringNo(array, target));
    }

    public static int FlooringNo(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
//        int ceilingNo = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) return arr[mid];

            else if (arr[mid] <= target) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
//                ceilingNo = arr[mid];     // Possible ceiling no
            }
        }
//        return ceilingNo;
        return end;
    }
}
