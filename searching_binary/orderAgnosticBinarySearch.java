package searching_binary;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] nums = {78, 67, 45, 34, 30, 29, 24, 19, 12, 9, 7, 5};
        int [] nums2 = {5, 7, 9, 12, 19, 24, 29, 30, 34, 45, 67, 78};

        int target = 78;

        System.out.println(binarySearch(nums2, target));
    }

    public static int binarySearch(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        boolean isAsc = nums[start] < nums[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(isAsc){
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
