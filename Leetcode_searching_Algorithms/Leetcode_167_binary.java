package Leetcode_searching_Algorithms;

public class Leetcode_167_binary {
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 9;

    }
    public static int [] twoSum(int [] nums, int target){
        int start_pointer = 0;
        int end_pointer = nums.length - 1;

        while (start_pointer <= end_pointer){
            int ans = nums[start_pointer] + nums[end_pointer];

            if(ans > target){
                end_pointer -= 1;
            } else if (ans < target) {
                start_pointer += 1;
            }else {
                return new int[]{start_pointer + 1, end_pointer + 1};
            }
        }

        return new int[]{-1, -1};
    }
}
