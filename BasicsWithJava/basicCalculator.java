package BasicsWithJava;

import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the basic calculator");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float a = input.nextFloat();

        System.out.println("Enter a second number: ");
        float b = input.nextFloat();

        System.out.println("Enter an operator: ");
        String opr = input.next();

        float ans = 0;

        switch (opr){
            case "+":
                ans = a + b;
                break;

            case "-":
                ans = a - b;
                break;

            case "*":
                ans = a * b;
                break;


            case "/":
                ans = a / b;
                break;
        }

        System.out.println("The ans is: "+ ans);
    }
}
