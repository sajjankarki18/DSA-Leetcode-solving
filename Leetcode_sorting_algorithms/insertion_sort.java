package Leetcode_sorting_algorithms;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int [] nums = {5, 3, 4, 1, 2};

        insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void insertionSort(int [] nums){
        for(int i = 0;i<nums.length - 1;i++){
            for(int j = i + 1;j>0;j--){
                if(nums[j] < nums[j - 1]){
                    swap(nums, j, j - 1);
                }else {
                    break;
                }
            }
        }
    }
    public static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
