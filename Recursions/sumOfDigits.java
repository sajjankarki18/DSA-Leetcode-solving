package Recursions;

public class sumOfDigits {
    public static void main(String[] args) {
        int num = 1234;

        System.out.println(sum(num));

    }
    public static int sum(int num){
        if (num < 0){
            return 0;
        }

        return sum(num / 10) + sum(num % 10);
    }
}
