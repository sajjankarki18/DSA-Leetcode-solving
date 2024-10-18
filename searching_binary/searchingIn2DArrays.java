package searching_binary;

import java.util.Arrays;

public class searchingIn2DArrays {
    public static void main(String[] args) {
        int [][] nums = {
                {10, 15, 20},
                {25, 30, 35},
                {50, 55, 60}
        };

        int target = 55;

        System.out.println(Arrays.toString(binarySearch(nums, target)));
    }

    public static int [] binarySearch(int [][] nums, int target){
        int row = 0;
        int col = nums.length - 1;

        while (row < nums.length && col >= 0){
            if(target == nums[row][col]){
                return new int[]{row, col};
            }

            if(target > nums[row][col]){
                row++;
            }else {
                col--;
            }
        }

        return new int[]{-1,-1};
    }
}
