package Leetcode_searching_Algorithms;

public class Leetcode_367 {
    public static void main(String[] args) {
        int num = 16;

        System.out.println(isPerfectSquare(num));

    }
    public static boolean isPerfectSquare(int num){
        if(num < 0){
            return false;
        }

        int start = 1;
        int end = num;

        while (start <= end){
            long mid = start + (end - start) / 2;

            long midSquare = mid * mid;

            if(midSquare == num){
                return true;
            } else if (midSquare > num) {
                end = (int) mid - 1;
            }else {
                start = (int) mid + 1;
            }
        }

        return false;
    }
}
