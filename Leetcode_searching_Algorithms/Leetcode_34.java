package Leetcode_searching_Algorithms;

import java.util.Arrays;

public class Leetcode_34 {
    public static void main(String[] args) {
        int [] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int [] searchRange(int [] nums, int target){
        int [] result = new int[2];
        result[0] = binarySearch(nums, target, true);
        result[1] = binarySearch(nums, target, false);

        if(result[0] == -1 && result[1] == -1){
            return new int[]{-1, -1};
        }

        return result;
    }

    public static int binarySearch(int [] nums, int target, boolean firstOccurance){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else {
                ans = mid;

                if(firstOccurance){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
