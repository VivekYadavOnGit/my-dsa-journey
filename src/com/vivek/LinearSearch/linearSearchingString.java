package com.vivek.LinearSearch;

public class linearSearchingString {
    public static void main(String[] args) {
        String givenStr = "dsndsbfdfnds nvudshfenfenfjdnfndfjdfe";
        char target = 'z';

//        int ans = searchString1(givenStr, target);
        boolean ans = searchString0(givenStr, target);
        System.out.println(ans);
    }


    public static boolean searchString0(String str, char target){
        if (str.isEmpty()){
            return false;
        }
        else {
            for (char ch : str.toCharArray()) {
                if (ch == target) {
                    return true;
                }
            }
        }

        return false;
    }

    
    public static boolean searchString(String str, char target){
        if (str.isEmpty()) {
            return false;
        }
        else{
            for (int index = 0; index < str.length(); index++) {

                if (target == str.charAt(index)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int searchString1(String str, char target){
        if (str.isEmpty()) {
            return -1;
        }
        else{
            for (int index = 0; index < str.length(); index++) {

                if (target == str.charAt(index)) {
                    return index;
                }
            }
        }
        return -1;
    }
}
