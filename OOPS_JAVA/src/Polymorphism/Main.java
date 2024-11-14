package Polymorphism;

//what is polymorphism mean?
//Polymorphism means many forms -> does same things in different ways

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat(5);

        Cat cat = new Cat();
        cat.eat();
    }
}


class Animal{
    private String name;
    private String color;

    public void eat(){
        System.out.println("munch munch");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal{
    private int breed;

    public void eat(int index){
        for (int i=0;i<=index;i++){
            System.out.println("crunch crunch");
        }
    }

    public int getBreed(){
        return breed;
    }

    public void setBreed(int breed){
        this.breed = breed;
    }
}

class Cat extends Animal{
    private String name;

    public void eat(){
        System.out.println("num num...");
    }
}

//So in this above example we have a eat method in super class that overrides the eat method in subclass
//so this is a polymorphism because it does the same things in the different ways
//The dog class overrides the functionality but does a different things

//the different forms of polymorphism are method overloading and method overriding