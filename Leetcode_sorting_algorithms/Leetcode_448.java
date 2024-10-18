package Leetcode_sorting_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_448 {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};

        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(findDissapearedArray(nums));
    }
    public static List<Integer> findDissapearedArray(int [] nums){
        List<Integer> list = new ArrayList<>();

        int index = 0;

        while (index < nums.length){
            int currentIndex = nums[index] - 1 ;

            if(nums[index] != nums[currentIndex]){
                swap(nums, index, currentIndex);
            }else {
                index++;
            }
        }

        for(int j = 0;j < nums.length;j++){
            if(nums[j] != j + 1){
                list.add(j + 1);
            }
        }

        return list;
    }

    public static void cyclicSort(int [] nums){
        int i = 0;

        while (i < nums.length){
            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }
    }

    public static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
