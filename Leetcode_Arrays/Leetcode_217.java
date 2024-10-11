package Leetcode_Arrays;

import java.util.HashSet;

public class Leetcode_217 {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4};

        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int [] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            if(!set.add(num)){
                return true;
            }
        }

        return false;
    }
}
