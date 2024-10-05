package Leetcode_searching_Algorithms;

import java.util.HashSet;

public class Leetcode_287 {
    public static void main(String[] args) {
        int [] nums = {3, 1, 3, 4, 2};

//        System.out.println(findDuplicate2(nums));
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate2(int [] nums){
        int ans = 0;
        for(int i = 0;i<nums.length;i++){

            for(int j = i + 1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    ans = nums[i];
                }
            }
        }

        return ans;
    }

    public static int findDuplicate(int [] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            if(!set.add(num)){
                return num;
            }
        }

        return -1;
    }
}
