package Leetcode_searching_Algorithms;

public class Leetcode_1095_revised {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(search(nums, target));

    }
    public static int search(int [] nums, int target){
        int peak = findPeak(nums);
        int firstIndex = binarySearch(nums, target, 0, peak);

        if(firstIndex != -1){
            return firstIndex;
        }

        return binarySearch(nums, target, peak + 1, nums.length - 1);

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

    public static int findPeak(int [] nums){
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
