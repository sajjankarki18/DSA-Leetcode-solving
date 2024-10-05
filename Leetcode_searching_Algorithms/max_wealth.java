package Leetcode_searching_Algorithms;

import java.util.Arrays;

public class max_wealth {
    public static void main(String[] args) {
        int [][] accounts = {
            {12,56,43},
            {45, 34, 10},
            {50, 22, 19},
            {48,43,7},
        };

        int ans = findMaxWealth(accounts);
        System.out.println("The maximum wealth is: "+ ans);
    }
    public static int findMaxWealth(int [][] accounts){
        int max_value = 0;

        for(int i = 0;i<accounts.length;i++){
            int sum = 0;

            for(int j = 0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }

            if(max_value < sum){
                max_value = sum;
            }
        }

        return max_value;
    }
}
