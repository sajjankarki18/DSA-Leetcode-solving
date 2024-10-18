package searching_binary;

public class findCeil {
    public static void main(String[] args) {
        //ceil means smallest number greater than equal to the target
        int [] nums = {10, 22, 26, 30, 45, 49, 57, 78, 90};
        int target = 58; //ans = index 1

        System.out.println(findCeil(nums, target));
        System.out.println(findFloor(nums, target));

    }
    public static int findCeil(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;

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

        return start;
    }
    public static int findFloor(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;

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

        return end;
    }
}
