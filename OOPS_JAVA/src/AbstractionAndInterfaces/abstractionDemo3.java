package AbstractionAndInterfaces;

public class abstractionDemo3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.bark();
    }
}


abstract class Dog{
    String breed;

    public abstract void bark();
}

class Cat extends Dog{

    public void bark(){
        System.out.println("Hey this is a dog");
    }
}
