package Leetcode_searching_Algorithms;

public class Leetcode_1095 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(findInMountainArray(nums, target));

    }
    public static int findInMountainArray(int [] nums, int target){
        int peak = findPeakElement(nums);
        int firstIndex = binarysearch(nums, target, 0, peak);

        if(firstIndex != -1){
            return firstIndex;
        }

        return binarysearch(nums, target, peak + 1, nums.length - 1);
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

    public static int binarysearch(int [] nums, int target, int start, int end){

        boolean isAscending = nums[start] < nums[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(isAscending){
                if(target > nums[mid]){
                    start = mid + 1;
                } else if (target < nums[mid]) {
                    end = mid - 1;
                }else {
                    return mid;
                }
            }else {
                if(target < nums[mid]){
                    start = mid + 1;
                } else if (target > nums[mid]) {
                    end = mid - 1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
