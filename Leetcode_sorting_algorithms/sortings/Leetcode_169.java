package Leetcode_sorting_algorithms.sortings;

import java.util.Arrays;

public class Leetcode_169 {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int [] nums){
        Arrays.sort(nums);
        int n = nums.length;

        return nums[n / 2];
    }
}
