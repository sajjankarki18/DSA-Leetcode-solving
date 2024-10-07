package Leetcode_searching_Algorithms;

//amazon interview question

public class infiniteArray {
    public static void main(String[] args) {
        int [] nums = {10, 15, 34, 45, 49, 56, 78, 90, 100, 120, 134, 150, 189, 209};
        int target = 189;

        System.out.println(ans(nums, target));

    }

    public static int ans(int [] nums, int target){
        int start = 0;
        int end = 1;

        while (target > nums[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2; //double the size of the box
            start = newStart;
        }

        return binarySearch(nums, target, start, end);
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
}
