package ArraysAndArrayLists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int [] nums = {1,2,5,7,9};

        reverseArray(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }
    public static void reverseArray(int [] nums, int start, int end){

        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

    }
}
