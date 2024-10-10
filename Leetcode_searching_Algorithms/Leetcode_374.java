package Leetcode_searching_Algorithms;

public class Leetcode_374 {
    public static void main(String[] args) {
        int num = 10;
        int pick = 11;

        System.out.println(guessNumber(num, pick));
    }
    public static int guessNumber(int num, int pick){
        int start = 0;
        int end = num;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(pick > mid){
                start = mid + 1;
            } else if (pick < mid) {
                end = mid - 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
