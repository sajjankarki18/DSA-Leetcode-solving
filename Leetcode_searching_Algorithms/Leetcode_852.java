package Leetcode_searching_Algorithms;

public class Leetcode_852 {
    public static void main(String[] args) {
        int [] nums = {0, 2, 1, 0};

        System.out.println(peakIndexInMountainArray(nums));

    }
    public static int peakIndexInMountainArray(int [] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }

        return start;
    }
}
