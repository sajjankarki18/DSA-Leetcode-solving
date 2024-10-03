package Leetcodes_easy;

import java.util.Scanner;

public class Leetcode_509 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        System.out.println(fib(num));

    }
    public static int fib(int n) {

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        int a = 0;
        int b = 1;
        int count = 2;

        while (count < n){
            int temp = b;
            b = b + a;
            a = temp;

            count++;
        }

        return b;
    }
}
