package Polymorphism;

//what is method overloading?
//-> method overloading refers to a methods in a class where there are two methods with the same name
//but different parameters are called as method overloading

public class methodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10, 20, 15);
        calculator.add(10.3, 45,  10.0);
    }
}

class Calculator{

    //here two methods are as same name but different parameters
    public void add(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public void add(double a, double b, double c){
        System.out.println(a + b + c);
    }
}
