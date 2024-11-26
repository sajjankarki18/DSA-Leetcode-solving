package Recursions;

public class product {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5}; //ans = 120

        System.out.println(findProduct(nums));
    }
    public static int findProduct(int [] nums){
        int prod = 1;

        for (int i=0;i<nums.length;i++){
            prod *= nums[i];
        }

        return prod;
    }

}
