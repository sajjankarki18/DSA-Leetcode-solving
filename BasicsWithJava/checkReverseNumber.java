package BasicsWithJava;

import java.util.Scanner;

public class checkReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ente a number: ");
        int number = scan.nextInt();

        System.out.println(reverse(number));
        System.out.println(checkPalindrome(number));

    }
    public static int reverse(int number){
        int reversedNumber = 0;

        while (number != 0){
            int digits = number % 10;
            reversedNumber = reversedNumber * 10 + digits;
            number = number / 10;
        }

        return reversedNumber;
    }

    public static boolean checkPalindrome(int number){
        int orgNum = number;
        int reversedNumber = 0;

        while (number != 0){
            int digits = number % 10;
            reversedNumber = reversedNumber * 10 + digits;
            number = number / 10;
        }

        if(orgNum == reversedNumber){
            return true;
        }

        return false;
    }
}
