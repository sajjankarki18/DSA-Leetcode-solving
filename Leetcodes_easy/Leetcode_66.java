package Leetcodes_easy;

import java.util.Arrays;

public class Leetcode_66 {
    public static void main(String[] args) {
        int [] nums = {9};

        System.out.println(Arrays.toString(plusOne(nums)));

    }
    public static int [] plusOne(int [] digits){

        for(int i = digits.length - 1;i>=0;i--){
            if(digits[i] < 9){
                digits[i] ++;

                return digits;
            }
            digits[i] = 0;
        }

        int [] new_arr = new int[digits.length + 1];
        new_arr[0] = 1;

        return new_arr;
    }
}
