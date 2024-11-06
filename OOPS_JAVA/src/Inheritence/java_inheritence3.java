package Inheritence;

public class java_inheritence3 {
    public static void main(String[] args) {
        Running running = new Running("Nike", 48, 10);
        running.getShoe();
    }
}

//note: superclass -> parent class and subclass -> child class

class Shoe{
    String brand;
    double size;

    public Shoe(String brand, double size){
        this.brand = brand;
        this.size = size;
    }

    public void getShoe(){
        System.out.println("Brand: "+ brand + " Size: "+ size);
    }
}

class Walking extends Shoe{
    public final boolean goreTex;

    public Walking(String brand, double size, boolean goreTex){
        super(brand, size);
        this.goreTex = goreTex;
    }
}

class Running extends Shoe{
    double weight;

    public Running(String brand, double size, double weight){
        super(brand, size);
        this.weight = weight;
    }
}






