package classesAndObjects;

//Create a Student Class:
//
//Define a class Student with fields: name, rollNumber, and grade.
//Create objects of this class and initialize them with values.
//Write a method displayDetails() to print the details of the student.

public class Question_1 {
    public static void main(String[] args) {
        Student student1 = new Student("sajan karki", 8, 'A');
        Student student2 = new Student("luffy", 10, 'B');

        student2.displayDetails();
    }
}

class Student{
    String name;
    int rollNo;
    char grade;

    //constructor for student class
    public Student(String name, int rollNo, char grade){
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: "+ rollNo);
        System.out.println("Grade: "+ grade);
    }
}