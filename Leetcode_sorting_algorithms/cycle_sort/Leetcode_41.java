package Leetcode_sorting_algorithms.cycle_sort;

public class Leetcode_41 {
    public static void main(String[] args) {
        int [] nums = {1, 2, 0};

        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int index = 0;

        while (index < nums.length){
            int correctIndex = nums[index] - 1;

            if(nums[index] > 0 && nums[index] <= nums.length && nums[index] != nums[correctIndex]){
                swap(nums, index, correctIndex);
            }else {
                index++;
            }
        }

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    public static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
