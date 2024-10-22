package Leetcode_sorting_algorithms.sortings;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int [] nums = {3, 5, 4, 1, 2};

        cycle_sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void cycle_sort(int [] nums){
        int index = 0;

        while (index < nums.length){
            int correctIndex = nums[index] - 1;

            if(nums[index] != nums[correctIndex]){
                swap(nums, index, correctIndex);
            }
            else {
                index++;
            }
        }
    }

    public static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
