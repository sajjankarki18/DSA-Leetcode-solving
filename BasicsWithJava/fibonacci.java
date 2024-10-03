package BasicsWithJava;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= num){
            int temp = b;
            b = a + b;
            a = temp;

            count++;
        }

        System.out.println(b);
    }
}
