package Leetcode_searching_Algorithms;

public class Leetcode_153 {
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};

        System.out.println(findMin(nums));
    }

    public static int findMin(int [] nums){
        int pivot = findPivot(nums);

        return  nums[pivot + 1];
    }

    public static int findPivot(int [] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }

            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }

            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
