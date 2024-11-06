package Leetcode_Arrays;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_136 {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};

        System.out.println(singleNumber(nums));

    }
    public static int singleNumber(int [] nums){
//        int result = 0;
//
//        for (int num: nums){
//            result ^= num;
//        }
//
//        return result;

        Set<Integer> seen = new HashSet<>();

        for (int num: nums){
            if (seen.contains(num)){
                seen.remove(num);
            }else {
                seen.add(num);
            }
        }

        return seen.iterator().next();
    }


}
