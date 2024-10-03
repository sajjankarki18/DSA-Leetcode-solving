package ArraysAndArrayLists;

public class arrays {
    public static void main(String[] args) {
        //basic array program for finding maximum number in array

        int [] nums = {12,45,67,32,70,10};
        System.out.println("The maximum number is: "+findMax(nums));
        System.out.println("The minimum number is: "+ findMin(nums));

    }
    public static int findMax(int [] nums){
        int max = nums[0];

        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        return max;
    }

    public static int findMin(int [] nums){
        int min = nums[0];

        for(int i = 0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }

        return min;
    }
}
