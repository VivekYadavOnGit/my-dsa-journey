package com.vivek.LinearSearch;

public class LinearSearchInArray {
    static void main() {
        int[] givenArray = {1000, 242, 543, 405, 2345, 645, 547, 238, 987, 10};
        int target = 100;

        int output = linearSearchArray(givenArray, target);
        System.out.println("The target " + target + " is found at index: " + output);
    }

    public static int linearSearchArray(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
