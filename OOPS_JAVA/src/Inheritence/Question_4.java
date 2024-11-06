package Inheritence;

public class Question_4 {
    public static void main(String[] args) {
        Car car = new Car();

    }
}

class Vehicle{

    public Vehicle(){
        System.out.println("vehicle created!");
    }
}

class Car extends Vehicle{
    public Car(){
        super();
        System.out.println("Car created!");
    }
}


