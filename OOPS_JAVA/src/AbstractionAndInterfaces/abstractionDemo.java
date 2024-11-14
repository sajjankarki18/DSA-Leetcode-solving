package AbstractionAndInterfaces;

public class abstractionDemo {
    public static void main(String[] args) {
        son s = new son(21);
        s.career();
        s.Partner();
    }
}

abstract class Parent{
    //if a class contains more than one abstract methods then class should be also declrared abstract
    int age;

    public Parent(int age){
        this.age = age;
    }

    abstract void career();
    abstract  void Partner();
}

class son extends Parent{
    //Note: every child class should override the abstract methods in the parent class

    public son(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a software developer");
    }

    @Override
    void Partner() {
        System.out.println("I love abc she is  21");
    }
}


//if the parent class methods are abstract and then the class itself should be delared as a abstract method
//Then the son class should override all the abstract methods in the parent class

//We cannot create objects of an abstract classes
//Abatract contructors are not allowed

//Why No Body for Abstract Methods?
//The reason for no body in abstract methods is that they are incomplete methods meant to be implemented by subclasses.