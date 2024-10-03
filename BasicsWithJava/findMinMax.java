package BasicsWithJava;

public class findMinMax {
    public static void main(String[] args) {
        int [] nums = {56,43,70,21,89,54};
        int max = nums[0];

        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println("The max number is: "+ max);
    }
}
