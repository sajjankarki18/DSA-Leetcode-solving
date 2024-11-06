package Inheritence;

public class Question_3 {
    public static void main(String[] args) {
        Animal [] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cat();

        for (Animal animal: animals){
            animal.sound();
        }
    }
}

class Animal{

    public void sound(){
        System.out.println("This is an animal sound!!");
    }
}

class Dog extends Animal{

    public void sound(){
        System.out.println("Bark Bark!");
    }
}

class Cat extends Animal{

    public void sound(){
        System.out.println("meow meow!!");
    }
}
