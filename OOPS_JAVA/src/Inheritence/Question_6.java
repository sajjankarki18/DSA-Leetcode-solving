package Inheritence;

public class Question_6 {
    public static void main(String[] args) {
        Cars cars = new Cars("deseil", 4, "BMW", 2000);
        cars.displayDetails();
    }
}

class Vehichles{
    String brand;
    int year;

    public Vehichles(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void displayDetails(){
        System.out.println("Brand: "+ brand + " Year: "+ year);
    }
}

class Cars extends Vehichles{
    String fuelType;
    int noOfDoors;

    public Cars(String fuelType,int noOfDoors,  String brand, int year){
        super(brand, year);
        this.fuelType = fuelType;
        this.noOfDoors = noOfDoors;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Fuel type: "+ fuelType);
    }
}
