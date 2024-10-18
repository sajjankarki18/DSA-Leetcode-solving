package searching_binary;

public class binary_search {
    public static void main(String[] args) {
        int [] nums = {10,12,24,45,67,89,90};
        int [] nums2 = {-10, -7, -6, -1, 0, 10, 34, 45, 49, 56, 67};
        int target = -10; //ans = 6

        System.out.println(binarySearch(nums2, target));

    }
    public static int binarySearch(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            //find the middle element
            int mid = start + (end - start) % 2;

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
