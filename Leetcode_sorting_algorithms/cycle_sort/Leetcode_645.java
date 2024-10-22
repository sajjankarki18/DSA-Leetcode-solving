package Leetcode_sorting_algorithms.cycle_sort;

import java.util.Arrays;

public class Leetcode_645 {
    public static void main(String[] args) {
        int [] nums = {1,2,2,4};

        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int [] findErrorNums(int [] nums){
        int index = 0;

        while (index < nums.length){
            int correctIndex = nums[index] - 1;

            if(nums[index] != nums[correctIndex]){
                swap(nums, index, correctIndex);
            }else {
                index++;
            }
        }

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != i + 1){
                return new int[]{i + 1, nums[i]};
            }
        }

        return new int[]{-1, -1};
    }

    public static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
