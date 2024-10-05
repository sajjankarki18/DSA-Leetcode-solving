package Leetcode_searching_Algorithms;

public class Leetcode_1295 {
    public static void main(String[] args) {
        int [] nums = {12, 345, 2, 6, 7896}; //ans = 2

        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int [] nums){
        int count = 0;

        for(int num: nums){
            if(isEven(num)){
                count++;
            }
        }

        return count;
    }

    public static boolean isEven(int num){
        if(checkNoOfDigits(num) % 2 == 0){
            return true;
        }
        return false;
    }

    public static int checkNoOfDigits(int num){
        int count = 0;

        while (num != 0){
            count++;
            num /= 10;
        }

        return count;
    }
}
