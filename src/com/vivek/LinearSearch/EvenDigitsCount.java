package com.vivek.LinearSearch;

public class EvenDigitsCount {
    public static void main(String[] args) {
        int[] arr = {87878, 66565, 45454, 989855,456621, 45544,78989456};
        System.out.println(findEvenDigitNos(arr));
    }

    public static int findEvenDigitNos(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean even(int count){
        int NumberOfDigits = Digits(count);
        return NumberOfDigits % 2 == 0;
    }

    public static int Digits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num /10;
        }
        return count;
    }
}
