package Leetcodes_easy;

public class Leetcode_7 {
    public static void main(String[] args) {
        int x = 120;

        System.out.println(reverse(x));

    }
    public static int reverse(int x){
        int reversedNumber = 0;

        while (x != 0){
            int digit = x % 10;

            if (reversedNumber > Integer.MAX_VALUE / 10 || (reversedNumber == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversedNumber < Integer.MIN_VALUE / 10 || (reversedNumber == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversedNumber = reversedNumber * 10 + digit;
            x = x / 10;
        }

        return reversedNumber;
    }
}
