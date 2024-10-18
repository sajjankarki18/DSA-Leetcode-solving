package Leetcode_sorting_algorithms;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int [] nums = {3, 1, 5, 4, 2};

//        bubbleSort(nums);
//        swap(nums);
        swap1(nums);
        System.out.println(Arrays.toString(nums));


    }
    public static void bubbleSort(int [] nums){

        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void swap(int [] nums){

        for(int i = 0;i<nums.length - 1;i++){
            for(int j = 1;j<nums.length;j++){
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }

    public static void swap1(int [] nums){

        for(int i = 0;i<nums.length;i++){
            for(int j = 1;j<nums.length;j++){
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
