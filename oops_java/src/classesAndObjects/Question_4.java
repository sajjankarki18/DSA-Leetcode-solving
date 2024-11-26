package classesAndObjects;

//1. Person Class
//Create a Person class with fields: name, age, and address.
//Write a method displayDetails() that prints the name, age, and address of the person.
//Create an object of the Person class and display its details.

public class Question_4 {
    public static void main(String[] args) {
        Person [] person = {
                new Person("luffy", 19, "eastblue"),
                new Person("zoro", 21, "eastblue"),
                new Person("nami", 19, "eastblue")
        };

        display(person);
    }

    public static void display(Person [] person){
        for (Person person1: person){
            person1.displayDetails();
            System.out.println("---------");
        }
    }
}

class Person{
    String name;
    int age;
    String address;

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Address: "+ address);
    }
}