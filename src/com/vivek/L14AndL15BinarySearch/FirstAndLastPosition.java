package com.vivek.L14AndL15BinarySearch;

public class FirstAndLastPosition {
    public static void main(String[] args){
        int[] nums = {1, 3, 3, 3, 5, 5, 5, 5, 7, 7, 7, 7, 8, 8};
        int target = 3;
        int[] ans = {-1, -1};
        ans[0] = getPositions(nums, target, true);
        if(ans[0] != -1){
            ans[1] = getPositions(nums, target, false);
        }
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
    public static int getPositions(int[] nums, int target, boolean isFirstIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end -start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                ans = mid;  // Found the target
                if(isFirstIndex){
                    end = mid - 1;   // moving left
                }
                else{
                    start = mid + 1;   // moving right
                }
            }
        }
        return ans;
    }
}
