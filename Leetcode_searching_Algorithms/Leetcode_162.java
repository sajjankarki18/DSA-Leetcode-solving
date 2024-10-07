package Leetcode_searching_Algorithms;

public class Leetcode_162 {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(nums));

    }
    public static int findPeakElement(int [] nums){
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
