package Recursions;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(5));
    }
    public static int fact(int num){
        if (num == 1){
            return 1;
        }

        return num * fact(num - 1);
    }

    public static int sum(int num){
        if (num == 1){
            return 1;
        }

        return num + sum(num - 1);
    }

}
