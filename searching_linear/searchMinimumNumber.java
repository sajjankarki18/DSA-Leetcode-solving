package searching_linear;

public class searchMinimumNumber {
    public static void main(String[] args) {
        int [] nums = {90, 78, 45, -90, 67, 89, 56};

        System.out.println(findMaximum(nums));
        System.out.println(findMinimum(nums));
    }
    public static int findMaximum(int [] nums){
        int max_value = nums[0];

        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max_value){
                max_value = nums[i];
            }
        }
        return max_value;
    }

    public static int findMinimum(int [] nums){
        int min_value = nums[0];

        for(int i = 0;i<nums.length;i++){
            if(nums[i] < min_value){
                min_value = nums[i];
            }
        }

        return min_value;
    }
}
