package com.vivek.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] givenArr = {18, 12, 9, 14, 77, 50};       // Given Array
        int target = 13;          // Number to search

//        int ans = linearSearch(givenArr, target);
        boolean ans = linearSearch2(givenArr, target);
        System.out.println(ans);
    }

    public static int linearSearch(int[] arr, int toFind) {

        if (arr.length == 0) {          // array is empty
            return -1;
        } else {                                  //checking if the array contains the target
            for (int index = 0; index < arr.length; index++) {
                int element = arr[index];

                if (element == toFind) {
                    return index;
                }
            }
        }
        return -1;
    }

        public static boolean linearSearch2(int[] arr, int toFind){

            //checking if the array contains the target
            for (int element : arr) {
                if (element == toFind) {
                    return true;
                }
            }

            return false;                     // if none of the loop executed the target NOT FOUND
    }
}
