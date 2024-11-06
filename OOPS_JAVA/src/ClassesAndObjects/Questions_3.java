package ClassesAndObjects;

//Create a Calculator class that has methods for basic arithmetic operations.
// Use method overloading to handle different parameter types (e.g., int, double).

public class Questions_3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 10, 10));
        System.out.println(calculator.add(20, 20, 20));
    }
}

class Calculator{
    //method overloading
    //When a method or functions have same name but different parameters are known as method overloading

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b, double c){
        return a + b + c;
    }

    public int sub(int a, int b, int c){
        return a - b - c;
    }

    public double sub(double a, double b, double c){
        return a - b - c;
    }

    public int mul(int a, int b, int c){
        return a * b * c;
    }

    public double mul(double a, double b, double c){
        return a * b * c;
    }

    //these functions have same name but different parameters are known as method overloading
}