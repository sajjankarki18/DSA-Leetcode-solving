package Leetcode_sorting_algorithms.cycle_sort;

public class Leetcode_268 {
    public static void main(String[] args) {
        int [] nums = {0,1};

        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int [] nums){
        int index = 0;

        while (index < nums.length){
            int correctIndex = nums[index];

            if(nums[index] < nums.length && nums[index] != nums[correctIndex]){
                swap(nums, index, correctIndex);
            }else {
                index++;
            }
        }

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }

        return nums.length;
    }

    public static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
