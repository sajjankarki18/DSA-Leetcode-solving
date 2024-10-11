package Leetcode_Arrays;

public class Leetcode_27 {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int value = 2;

//        System.out.println(removeElement(nums, value));
        System.out.println(removeElement2(nums, value));

    }
    public static int removeElement(int [] nums, int value){
        int k = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != value){
                k++;
            }
        }
        return k;
    }

    public static int removeElement2(int [] nums, int value){
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != value){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
