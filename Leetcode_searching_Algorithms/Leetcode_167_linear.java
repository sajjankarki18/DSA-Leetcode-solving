package Leetcode_searching_Algorithms;

import java.util.Arrays;

public class Leetcode_167_linear {
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
    public static int [] twoSum(int [] nums, int target){

        if(nums.length == 0){
            return new int[]{-1, -1};
        }

        for(int i = 0;i<nums.length;i++){
            for(int j = i + 1;j<nums.length;j++){
                if (target == nums[i] + nums[j]){
                    return new int[]{i + 1, j + 1};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
