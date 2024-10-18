package Leetcode_sorting_algorithms;

import java.util.Arrays;

public class Leetcode_287 {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};

        System.out.println(findDuplicates(nums));
    }
    public static int findDuplicates(int [] nums){
        int index = 0;

        while (index < nums.length){
            int correctIndex = nums[index] - 1;

            if(nums[index] != index + 1){
                if(nums[index] != nums[correctIndex]){
                    swap(nums, index, correctIndex);
                }else {
                    return nums[index];
                }
            }else {
                index++;
            }
        }

        return -1;
    }
    public static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
