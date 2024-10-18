package Leetcode_sorting_algorithms;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int [] nums = {3, 1, 5, 4, 2};

        selectionSort(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void selectionSort(int [] nums){

        for(int i = 0;i<nums.length;i++){
            //for each iteration of finding max numbers the array reduces
            int last = nums.length - i - 1;

            //first find the max index and swap it to the last element
            int max_index = findMaxIndex(nums, 0, last);

            //swap the max index with the last number
            swapNumbers(nums, max_index, last);
        }
    }

    public static void swapNumbers(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static int findMaxIndex(int [] nums, int start, int end){
        int max_index = start;

        for(int i = start;i<end;i++){
            if(nums[i] > nums[max_index]){
                max_index = i;
            }
        }

        return max_index;
    }
}
