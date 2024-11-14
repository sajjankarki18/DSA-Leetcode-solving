package AbstractionAndInterfaces;

//Abstract Class for Vehicles:
//
//Create an abstract class Vehicle with methods like startEngine() and stopEngine().
//Extend Vehicle to create subclasses Car and Bike.
//Implement startEngine() and stopEngine() differently for Car and Bike to illustrate how they work for each.

public class Question1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        Bike bike = new Bike();
        bike.startEngine();
        bike.stopEngine();
    }
}


abstract class Vehicle{
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle{

    public void startEngine(){
        System.out.println("Car started...");
    }

    public void stopEngine(){
        System.out.println("Car stopped...");
    }
}

class Bike extends Vehicle{
    public void startEngine(){
        System.out.println("Bike started...");
    }

    public void stopEngine(){
        System.out.println("Bike stopped...");
    }
}
