package Leetcodes_easy;

import java.util.Arrays;

public class Leetcode_628 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};

        System.out.println(bruteForce(nums));
        System.out.println(findMaximumProduct(nums));
    }

    public static int bruteForce(int [] nums){

        Arrays.sort(nums);
        int max_mul = Integer.MIN_VALUE;

        for(int i = 0;i<nums.length - 2;i++){
            for(int j = i + 1;j<nums.length - 1;j++){
                for(int k = j + 1;k<nums.length;k++){
                    int mul = nums[i] * nums[j] * nums[k];

                    if(mul > max_mul){
                        max_mul = mul;
                    }
                }
            }
        }

        return max_mul;
    }

    public static int findMaximumProduct(int [] nums){
        Arrays.sort(nums);

        int n = nums.length;

        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);

    }
}
