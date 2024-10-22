package Leetcode_sorting_algorithms.sortings;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] nums = {3, 2, 4, 1, 5};

        bubble_sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void bubble_sort(int [] nums){

        for(int i = 0;i< nums.length;i++){
            for(int j = 0;j<nums.length - 1;j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
