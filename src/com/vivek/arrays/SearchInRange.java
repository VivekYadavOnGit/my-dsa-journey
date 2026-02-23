package com.vivek.arrays;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {77, 22, 44, 99, 55, 11, 33, 88};
        int target = 33;

        boolean ans = SearchRange(arr, target, 4, 6);
        System.out.println(ans);
    }

    static boolean SearchRange(int[] arr, int target, int start, int end){

        if (arr.length == 0){
            return false;
        }
        else{
            for (int i = start; i <= end; i++) {
                if (arr[i] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
