package com.vivek.L14AndL15BinarySearch;

public class CeilingNoSoln {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 9, 13, 14, 16, 18};
        int target = 19;
        System.out.println(CeilingNo(array, target));
    }

    public static int CeilingNo(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
//        int ceilingNo = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[arr.length - 1]){
                return -1;
            }

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
        return start;
    }

    static class IntPalindrome{
    public static int reverse(int x) {

        int rev = 0;
        while(x != 0){
            if(x > Integer.MAX_VALUE / 10 || x < Integer.MIN_VALUE / 10){
                return 0;
            }
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        return rev;
    }

        public static void main(String[] args) {
            int num = 123;
            System.out.println(reverse(num));
        }
    }
}
