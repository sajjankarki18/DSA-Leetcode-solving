package Leetcode_sorting_algorithms.cycle_sort;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_448 {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));
    }
    public static void cyclicSort(int [] nums){
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

    public static List<Integer> findDisappearedNumbers(int [] nums){
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

        for(int i = 0;i<nums.length - 1;i++){
            if(nums[i] != i + 1){
                list.add(i + 1);
            }
        }

        return list;
    }

    public static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
