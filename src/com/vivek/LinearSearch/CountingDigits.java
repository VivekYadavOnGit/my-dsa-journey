package com.vivek.LinearSearch;

public class CountingDigits {
    public static void main(String[] args) {
        int[] arr = {454547, 454232669, 544785, 4545655, 45456, 4545454};
        System.out.println(findDigitCount(arr));
    }

    static int findDigitCount(int[] arr){
        int count = 0;
        for (int r = 0; r < arr.length; r++) {
            if (even(arr[r])) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int count){
        int numOfDigits = digit(count);
        if(numOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digit(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}