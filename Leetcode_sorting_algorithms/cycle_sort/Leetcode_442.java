package Leetcode_sorting_algorithms.cycle_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_442 {
    public static void main(String[] args) {
        int [] nums = {1};

        System.out.println(findDuplicates(nums));

    }
    public static List<Integer> findDuplicates(int [] nums){
        List<Integer> list = new ArrayList<>();

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

        for(int i=0;i<nums.length;i++){
            if(nums[i] != i + 1){
                list.add(nums[i]);
            }
        }

        return list;
    }

    public static void cycleSort(int [] nums){
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
