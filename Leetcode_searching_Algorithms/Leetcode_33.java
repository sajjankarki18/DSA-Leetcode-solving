package Leetcode_searching_Algorithms;

public class Leetcode_33 {
    public static void main(String[] args) {
        int [] nums = {1};
        int target = 0;

        System.out.println(search(nums, target));
    }

    public static int search(int [] nums, int target){
        int pivot = findPivot(nums);
        int first = binarySearch(nums, target, 0, pivot);

        if(first != -1){
            return first;
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
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

            if(nums[start] >= mid){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
