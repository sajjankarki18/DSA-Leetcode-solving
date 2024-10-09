package Leetcode_searching_Algorithms;

public class rotatedCount {
    public static void main(String[] args) {
        int [] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(rotatedCount(nums));

    }

    public static int rotatedCount(int [] nums){
        int count = pivot(nums);

        return count + 1;
    }
    public static int pivot(int [] nums){
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
            }else {
                start = mid + 1;
            }

        }

        return -1;
    }
}
