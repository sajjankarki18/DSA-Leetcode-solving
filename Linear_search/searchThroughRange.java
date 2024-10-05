package Linear_search;

public class searchThroughRange {
    public static void main(String[] args) {
        int [] nums = {12, 67, 45, 90, 78, 21, 65, 45, -90, -78, 122};
        int target = -90;

        System.out.println(search_in_range(nums, target, 7, 10));

    }
    public static int search_in_range(int [] nums, int target, int start, int end){
        if(nums.length == 0){
            return -1;
        }

        for(int i = start;i<=end;i++){
            if(nums[i] == target){
                return i;
            }
        }

        return -1; //The target is not found in the array

    }
}
