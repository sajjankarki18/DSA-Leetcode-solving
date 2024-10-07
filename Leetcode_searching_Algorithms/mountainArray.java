package Leetcode_searching_Algorithms;

public class mountainArray {
    public static void main(String[] args) {
        int [] nums = {0,1,2,4,2,1};
        int target = 3;

        System.out.println(findInMountanArray(nums, target));

    }
    public static int findInMountanArray(int [] nums,  int target){
        int ans = -1;

        int a = binarySearch(nums, target, true);
        int b = binarySearch(nums, target, false);

        if(a != -1){
            return a;
        }

        return -1;
    }

    public static int binarySearch(int [] nums, int target, boolean occurance){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else {
                ans = mid;

                if(occurance){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
