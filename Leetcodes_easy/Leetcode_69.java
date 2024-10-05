package Leetcodes_easy;

public class Leetcode_69 {
    public static void main(String[] args) {
        int x = 8;

        System.out.println(sqrt(x));

    }
    public static int sqrt(int x){

        long i = 0;

        while (i * i <= x){
            i++;
        }

        return (int) i - 1;
    }
}
