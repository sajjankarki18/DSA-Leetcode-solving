package Recursions;

public class printnto1 {
    public static void main(String[] args) {
        print(10);
    }
    public static void print(int num){

        if (num == 1){
            System.out.println(1);
            return;
        }

        System.out.println(num);
        print(num - 1);
    }
}

