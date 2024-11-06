package Leetcode_Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_121 {
    public static void main(String[] args) {
        int [] nums = {7,1,5,3,6,4};

        System.out.println(maxProfit(nums));
        System.out.println(maxProfit2(nums));
    }


    //insufficeint approach
    public static int maxProfit(int [] nums){
        int max_profit = 0;

        for (int i=0;i<nums.length;i++){
            for (int j = i + 1;j<nums.length;j++){
                if (nums[j] - nums[i] > max_profit){
                    max_profit = nums[j] - nums[i];
                }
            }
        }
        return max_profit;
    }

    public static int maxProfit2(int [] prices){
        int buy = prices[0];
        int max_profit = 0;

        for (int i=1;i<prices.length;i++){
            if (prices[i] < buy){
                buy = prices[i];
            }else if (prices[i] - buy > max_profit){
                max_profit = prices[i] - buy;
            }
        }

        return max_profit;
    }

}
