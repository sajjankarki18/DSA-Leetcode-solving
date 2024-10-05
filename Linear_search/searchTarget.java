package Linear_search;

public class searchTarget {
    public static void main(String[] args) {
        int [] nums = {12,34,56,78,21,89, -70};
        int target = -70;

        System.out.println("The target element is found at index: "+ linear_search(nums, target));

    }
    public static int linear_search(int [] nums, int target){

        if(nums.length == 0){
            return -1;
        }

        for(int i = 0;i<nums.length;i++){
            if(target == nums[i]){
                return i;
            }
        }

        return -1; //-1 means no target element has found
    }
}
