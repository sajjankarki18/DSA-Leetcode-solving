package BasicsWithJava;

import java.util.Scanner;

public class findMinMax2 {
    public static void main(String[] args) {
        int [] nums = {56,43,70,21,89,54};

        System.out.println("The minimum number is: " + findMin(nums));
        System.out.println("The minimum number is: " + findMax(nums));

    }
    public static int findMax(int [] nums){
        int max = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    public static int findMin(int [] nums){
        int min = nums[0];

        for(int i = 0;i<nums.length;i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
}
