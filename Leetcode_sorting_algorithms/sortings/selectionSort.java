package Leetcode_sorting_algorithms.sortings;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int [] nums = {3, 2, 4, 1, 5};

        selection_sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void selection_sort(int [] nums){

        for(int i=0;i<nums.length;i++){
            int last_index = nums.length - i - 1;
            int max_index = findMaxIndex(nums, 0, last_index);

            swap(nums, max_index, last_index);
        }
    }

    public static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static int findMaxIndex(int [] nums, int start, int end){
        int max_index = start;

        for (int i=start;i<=end;i++){
            if(nums[i] > nums[max_index]){
                max_index = i;
            }
        }
        return max_index;
    }
}
