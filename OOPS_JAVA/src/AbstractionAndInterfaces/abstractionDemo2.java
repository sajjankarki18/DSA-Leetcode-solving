package AbstractionAndInterfaces;

//simple example of abstraction
public class abstractionDemo2 {
    public static void main(String[] args) {
        square sq = new square();
        sq.sayShape();

        rectangle rect = new rectangle();
        rect.sayShape();
    }
}

abstract class shape{
    abstract void sayShape();
}

class square extends shape{

    public void sayShape(){
        System.out.println("My name is square...");
    }
}

class rectangle extends shape{
    public void sayShape(){
        System.out.println("My name is rectangle...");
    }
}