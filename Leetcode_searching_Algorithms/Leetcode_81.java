package Leetcode_searching_Algorithms;

public class Leetcode_81 {
    public static void main(String[] args) {
        int [] nums = {2,9,2,2,2};
        int target = 9;

        System.out.println(search(nums, target));

    }
    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if(binarySearch(nums, target, 0, pivot) != -1){
            return true;
        }

        if(binarySearch(nums, target, pivot + 1, nums.length - 1) != -1){
            return true;
        }

        return false;
    }

    public static int binarySearch(int [] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }

        return -1;
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

            if(nums[mid] <= start){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
