package Leetcode_sorting_algorithms;

public class Leetcode_268 {
    public static void main(String[] args) {
        int [] nums = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int [] nums){
        int i = 0;

        while (i < nums.length){
            int correctIndex = nums[i];

            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }

        for(int index = 0;index <nums.length;index++){
            if(nums[index] != index){
                return index;
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
