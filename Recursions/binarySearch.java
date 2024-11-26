package Recursions;

public class binarySearch {
    public static void main(String[] args) {
        int [] nums = {10, 12, 23, 34, 56, 78, 90};
        int target = 90;

        System.out.println(search(nums, target, 0, nums.length - 1));

    }
    public static int search(int [] nums, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == nums[mid]){
            return mid;
        }

        if (target > nums[mid]){
            return search(nums, target, mid + 1, end);
        }

        return search(nums, target, start, mid - 1);
    }
}
