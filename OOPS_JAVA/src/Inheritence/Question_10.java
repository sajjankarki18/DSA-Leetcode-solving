package Inheritence;

public class Question_10 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("nvidia rtx 4080", 16, 12);
        laptop.displaySpecs();
    }
}

class Computer{
    String processor;
    int ramSize;

    public Computer(String processor, int ramSize){
        this.processor = processor;
        this.ramSize = ramSize;
    }

    public void displaySpecs(){
        System.out.println("Processor: "+ processor + " Ram: "+ ramSize);
    }
}

class Laptop extends Computer{
    int batteryLife;

    public Laptop(String processor, int ramSize, int batteryLife){
        super(processor, ramSize);
        this.batteryLife = batteryLife;
    }

    public void displaySpecs(){
        super.displaySpecs();
        System.out.println("Battery Life: "+ batteryLife);
    }
}
