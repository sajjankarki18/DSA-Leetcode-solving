package Inheritence;

public class Question_1 {
    public static void main(String[] args) {
       Student student = new Student("sajan karki", 21, 10);
       student.displayInformation();
    }
}


class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInformation(){
        System.out.println("My name is: "+ name + " and i am "+ age + " years old");
    }
}

class Student extends Person{
    int studentId;

    public Student(String name, int age, int studentId){
        super(name, age);
        this.studentId = studentId;
    }

    public void displayInformation(){
        super.displayInformation();
        System.out.println("Student id: "+ studentId);
    }
}