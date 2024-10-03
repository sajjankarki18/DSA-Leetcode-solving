package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class swapNumbers {
    public static void main(String[] args) {
        int [] nums = {12,56,43,21,90,56};

        swapNumbers(nums, 2, 5);

        System.out.println(Arrays.toString(nums));
    }

    public static void swapNumbers(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
