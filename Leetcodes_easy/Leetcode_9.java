package Leetcodes_easy;

public class Leetcode_9 {
    public static void main(String[] args) {
        int x = -121;

        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        int reversedNumber = 0;
        int orgNumber = x;

        while (x != 0 && x > 0){
            int digits = x % 10;
            reversedNumber = reversedNumber * 10 + digits;
            x = x / 10;
        }

        if(orgNumber == reversedNumber){
            return true;
        }

        return false;

    }
}
