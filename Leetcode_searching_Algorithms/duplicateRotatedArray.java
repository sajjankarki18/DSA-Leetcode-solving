package Leetcode_searching_Algorithms;

public class duplicateRotatedArray {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int target = 4;

        System.out.println(search(nums, target));
    }
    public static int search(int [] nums, int target){
        int pivot = duplicateRotatedArray(nums);
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

    public static int duplicateRotatedArray(int [] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid + 1]){
                return mid - 1;
            }

            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                //if there exists any duplicate values simply reduce the size of the both sides
                //there is a case where start or send is the greatest element
                if(start < end && nums[start] > nums[start + 1]){
                    return start;
                }
                start++;

                if(end > start && nums[end] < nums[end - 1]){
                    return end - 1;
                }
                end--;

            }
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
