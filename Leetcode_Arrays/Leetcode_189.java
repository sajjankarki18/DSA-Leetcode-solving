package Leetcode_Arrays;

public class Leetcode_189 {
    public static void main(String[] args) {
        int [] nums = {-1,-100,3,99};
        int k = 2; //ans = {5,6,7,1,2,3,4}

        rotate(nums, k);
        for(int num: nums){
            System.out.println(num);
        }
    }
    public static void rotate(int [] nums, int k){
        k = k % nums.length;

        rotateArray(nums, 0, nums.length - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, nums.length - 1);
    }
    public static void rotateArray(int [] nums, int start, int end){
        while (start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
