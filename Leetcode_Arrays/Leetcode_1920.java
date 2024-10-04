package Leetcode_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_1920 {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};

        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int [] new_array = new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            new_array[i] = nums[nums[i]];
        }

        return new_array;
    }
}
