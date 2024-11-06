package Inheritence;

public class Question_2 {
    public static void main(String[] args) {
        Students students = new Students(1, "sajankarki", 21);
        students.displayInformation();
    }
}

class Persons{
    String name;
    int age;

    public Persons(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayInformation(){
        System.out.println("Name: "+ name + " Age: "+ age);
    }
}

class Students extends Person{
    int studentId;

    public Students(int studentId, String name, int age){
        super(name, age);
        this.studentId = studentId;
    }

    public void displayInformation(){
        super.displayInformation();
        System.out.println("StudentId: "+ studentId);
    }
}

//what is method overridden
//Method overridden means a function or a method with a same name but different functionalities is called as method overriddens

