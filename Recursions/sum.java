package Recursions;

public class sum {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};

        System.out.println(sum(nums));
    }

    public static int sum(int [] nums){
        int sum = 0;

        for (int i=0;i<nums.length;i++){
            sum+= nums[i];
        }

        return sum;
    }
}
