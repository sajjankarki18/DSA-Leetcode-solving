package Leetcode_Arrays;

import java.util.Arrays;

public class Leetcode_1365 {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] new_arr = new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            int count = 0;

            for(int j = 0;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }

            new_arr[i] = count;
        }
        return new_arr;
    }
}
